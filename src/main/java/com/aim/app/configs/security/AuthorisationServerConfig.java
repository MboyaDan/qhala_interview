package com.aim.app.configs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
@EnableAuthorizationServer
public class AuthorisationServerConfig extends AuthorizationServerConfigurerAdapter {

	private String GRANT_TYPE_PASSWORD = "password";
	private String AUTHORIZATION_CODE = "authorization_code";
	private String REFRESH_TOKEN = "refresh_token";
	private String SCOPE_READ = "read";
	private String SCOPE_WRITE = "write";
	private int ACCESS_TOKEN_VALIDITY = (60 * 3600);
	private int REFRESH_TOKEN_VALIDITY = (60 * 1800);

	@Value("${basic.auth.client.id}")
	private String clientId;
	@Value("${basic.auth.client.pass}")
	private String clientPass;

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserDetailsService userService;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private TokenStore tokenStore;

	@Bean
	JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		return converter;
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient(clientId).secret(passwordEncoder.encode(clientPass))
				.authorizedGrantTypes(GRANT_TYPE_PASSWORD, AUTHORIZATION_CODE, REFRESH_TOKEN)
				.scopes(SCOPE_READ, SCOPE_WRITE).resourceIds("api").accessTokenValiditySeconds(ACCESS_TOKEN_VALIDITY)
				.refreshTokenValiditySeconds(REFRESH_TOKEN_VALIDITY);
	}

	@Override
	public void configure(final AuthorizationServerEndpointsConfigurer endpoints) {
		endpoints.accessTokenConverter(accessTokenConverter()).tokenStore(this.tokenStore)
				.userDetailsService(userService).authenticationManager(authenticationManager);
	}

	@Bean
	@Primary
	public DefaultTokenServices tokenServices() {
		DefaultTokenServices tokenServices = new DefaultTokenServices();
		tokenServices.setSupportRefreshToken(true);
		tokenServices.setTokenStore(this.tokenStore);
		return tokenServices;
	}

}
