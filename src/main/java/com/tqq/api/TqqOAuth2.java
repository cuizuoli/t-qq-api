/*
 * @(#)TqqOAuth2.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.api;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.tqq.http.client.TqqHttpClient;
import com.tqq.model.TqqAccessToken;

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
	private static final String OAUTH2_ACCESS_TOKEN = "https://open.t.qq.com/cgi-bin/oauth2/access_token";

	@Value("#{tqqProperties['tqq.appKey']}")
	private String appKey;

	@Value("#{tqqProperties['tqq.appSecret']}")
	private String appSecret;

	@Value("#{tqqProperties['tqq.redirectUri']}")
	private String redirectUri;

	@Resource
	private TqqHttpClient tqqHttpClient;

	/**
	 * http://wiki.open.t.qq.com/index.php/OAuth2.0%E9%89%B4%E6%9D%83#.E7.AC.AC.E4.B8.80.E6.AD.A5.EF.BC.9A.E8.AF.B7.E6.B1.82code
	 * @param state
	 * @return
	 */
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

	/**
	 * http://wiki.open.t.qq.com/index.php/OAuth2.0%E9%89%B4%E6%9D%83#.E7.AC.AC.E4.BA.8C.E6.AD.A5.EF.BC.9A.E8.AF.B7.E6.B1.82accesstoken
	 * @param code
	 * @param state
	 * @return
	 */
	public TqqAccessToken accessToken(String code, String state) {
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("client_id", appKey);
		map.add("client_secret", appSecret);
		map.add("grant_type", "authorization_code");
		map.add("code", code);
		map.add("redirect_uri", redirectUri);
		map.add("state", state);
		String result = tqqHttpClient.postForm(OAUTH2_ACCESS_TOKEN, map, String.class);
		TqqAccessToken tqqAccessToken = new TqqAccessToken();
		for (String kv : StringUtils.split(result, "&")) {
			if (StringUtils.startsWith(kv, "access_token=")) {
				tqqAccessToken.setAccessToken(StringUtils.substringAfter(kv, "access_token="));
			}
			if (StringUtils.startsWith(kv, "expires_in=")) {
				tqqAccessToken.setExpiresIn(StringUtils.substringAfter(kv, "expires_in="));
			}
			if (StringUtils.startsWith(kv, "refresh_token=")) {
				tqqAccessToken.setRefreshToken(StringUtils.substringAfter(kv, "refresh_token="));
			}
			if (StringUtils.startsWith(kv, "openid=")) {
				tqqAccessToken.setOpenid(StringUtils.substringAfter(kv, "openid="));
			}
			if (StringUtils.startsWith(kv, "name=")) {
				tqqAccessToken.setName(StringUtils.substringAfter(kv, "name="));
			}
			if (StringUtils.startsWith(kv, "nick=")) {
				tqqAccessToken.setNick(StringUtils.substringAfter(kv, "nick="));
			}
			if (StringUtils.startsWith(kv, "state=")) {
				tqqAccessToken.setState(StringUtils.substringAfter(kv, "state="));
			}
		}
		return tqqAccessToken;
	}

}
