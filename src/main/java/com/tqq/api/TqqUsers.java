/*
 * @(#)TqqUsers.java $version 2013年12月22日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.api;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tqq.http.client.TqqHttpClient;
import com.tqq.model.TqqUser;

import lombok.extern.slf4j.Slf4j;

/**
 * DaLian Software t-qq-api
 * com.tqq.api.TqqUsers.java
 * @author cuizuoli
 * @date 2013年12月22日
 */
@Slf4j
@Component
public class TqqUsers {

	private static final String USER_OTHER_INFO_URL = "https://open.t.qq.com/api/user/other_info";

	@Value("#{tqqProperties['tqq.appKey']}")
	private String appKey;

	@Resource
	private TqqHttpClient tqqHttpClient;

	@Resource
	private ObjectMapper tqqObjectMapper;

	/**
	 * http://open.t.163.com/wiki/index.php?title=%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E7%94%A8%E6%88%B7%E7%9A%84%E4%BF%A1%E6%81%AF(users/show)
	 * @param userId
	 * @param accessToken
	 * @return
	 */
	public TqqUser otherInfo(String name, String accessToken, String openid) {
		String url = new StringBuffer()
			.append(USER_OTHER_INFO_URL)
			.append("?format=json")
			.append("&name=").append(name)
			.append("&access_token=").append(accessToken)
			.append("&oauth_consumer_key=").append(appKey)
			.append("&openid=").append(openid)
			.append("&oauth_version=2.a")
			.toString();
		String result = tqqHttpClient.get(url, String.class);
		TqqUser tqqUser = null;
		try {
			tqqUser = tqqObjectMapper.readValue(result, TqqUser.class);
			log.info(tqqUser.toString());
		} catch (JsonParseException e) {
			log.error(ExceptionUtils.getFullStackTrace(e));
		} catch (JsonMappingException e) {
			log.error(ExceptionUtils.getFullStackTrace(e));
		} catch (IOException e) {
			log.error(ExceptionUtils.getFullStackTrace(e));
		}
		return tqqUser;
	}

}
