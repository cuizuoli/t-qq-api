/*
 * @(#)TqqApi.java $version 2013年12月22日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * DaLian Software t-qq-api
 * com.tqq.api.TqqApi.java
 * @author cuizuoli
 * @date 2013年12月22日
 */
@Component
public class TqqApi {

	@Value("#{tqqProperties['tqq.appKey']}")
	private String appKey;

	/**
	 * accessToken
	 * @param accessToken
	 * @return
	 */
	public String getCommonUrl(String accessToken, String openid) {
		return new StringBuffer()
			.append("?format=json")
			.append("&oauth_consumer_key=").append(appKey)
			.append("&access_token=").append(accessToken)
			.append("&openid=").append(openid)
			.append("&oauth_version=2.a")
			.append("&scope=all")
			.toString();
	}

}
