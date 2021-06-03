/**
 * 
 */
package com.aim.app.accounts.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author aim
 *
 */

@Entity
@Table(name = "oauth_access_token")
public class OauthAccessToken {

	@Id
	@Column(name = "authentication_id", length = 255)
	private String authenticationId;

	@Column(name = "token_id", length = 255)
	@NotNull
	private String TokenId;

	@Lob
	@Column(name = "token", columnDefinition = "BLOB")
	private byte[] token;

	@Column(name = "user_name", length = 255)
	@NotNull
	private String userName;

	@Column(name = "client_id", length = 255)
	private String clientId;

	@Lob
	@Column(name = "authentication", columnDefinition = "BLOB")
	private byte[] authentication;

	@Column(name = "refresh_token", length = 255)
	private String refreshToken;

}
