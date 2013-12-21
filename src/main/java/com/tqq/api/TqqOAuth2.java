/*
 * @(#)TqqOAuth2.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.api;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tqq.http.client.TqqHttpClient;

import lombok.extern.slf4j.Slf4j;

/**
 * DaLian Software t-qq-api
 * com.tqq.api.TqqOAuth2.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Slf4j
@Component
public class TqqOAuth2 {

	private static final String OAUTH2_AUTHORIZE = "https://open.t.qq.com/cgi-bin/oauth2/authorize";

	@Value("#{tqqProperties['tqq.appKey']}")
	private String appKey;

	@Value("#{tqqProperties['tqq.appSecret']}")
	private String appSecret;

	@Value("#{tqqProperties['tqq.redirectUri']}")
	private String redirectUri;

	@Resource
	private TqqHttpClient tqqHttpClient;

	public String authorize(String state) {
		String authorizeUrl = new StringBuffer()
			.append(OAUTH2_AUTHORIZE)
			.append("?client_id=").append(appKey)
			.append("&redirect_uri=").append(redirectUri)
			.append("&response_type=code")
			.append("&state=").append(state)
			.append("&forcelogin=true")
			.toString();
		log.info(authorizeUrl);
		return authorizeUrl;
	}

}
