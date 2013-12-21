/*
 * @(#)TqqAccessToken.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.model;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * DaLian Software t-qq-api
 * com.tqq.model.TqqAccessToken.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Data
public class TqqAccessToken {
	private String uid;
	@JsonProperty("expires_in")
	private String expiresIn;
	@JsonProperty("refresh_token")
	private String refreshToken;
	@JsonProperty("access_token")
	private String accessToken;
	private String openid;
	private String name;
	private String nick;
	private String state;
}
