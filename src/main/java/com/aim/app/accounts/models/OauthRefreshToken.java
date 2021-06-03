package com.aim.app.accounts.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_refresh_token")
public class OauthRefreshToken {

	@Id
	@Column(name = "token_id", length = 255)
	private String tokenId;

	@Lob
	@Column(name = "token", columnDefinition = "BLOB")
	private byte[] token;

	@Lob
	@Column(name = "authentication", columnDefinition = "BLOB")
	private byte[] authentication;

}
