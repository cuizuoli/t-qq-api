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

	private static final String USER_INFO_URL = "https://open.t.qq.com/api/user/info";
	private static final String USER_OTHER_INFO_URL = "https://open.t.qq.com/api/user/other_info";

	@Value("#{tqqProperties['tqq.appKey']}")
	private String appKey;

	@Value("#{tqqProperties['tqq.openid']}")
	private String openid;

	@Resource
	private TqqHttpClient tqqHttpClient;

	@Resource
	private ObjectMapper tqqObjectMapper;

	@Resource
	private TqqApi tqqApi;

	public TqqUser info(String accessToken, String openid) {
		String url = new StringBuffer()
			.append(USER_INFO_URL)
			.append(tqqApi.getCommonUrl(accessToken, openid))
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

	/**
	 * http://open.t.163.com/wiki/index.php?title=%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E7%94%A8%E6%88%B7%E7%9A%84%E4%BF%A1%E6%81%AF(users/show)
	 * @param fopenid
	 * @param accessToken
	 * @param openid
	 * @return
	 */
	public TqqUser otherInfo(String fopenid, String accessToken, String openid) {
		String url = new StringBuffer()
			.append(USER_OTHER_INFO_URL)
			.append(tqqApi.getCommonUrl(accessToken, openid))
			.append("&fopenid=").append(fopenid)
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

	/**
	 * http://open.t.163.com/wiki/index.php?title=%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E7%94%A8%E6%88%B7%E7%9A%84%E4%BF%A1%E6%81%AF(users/show)
	 * @param name
	 * @param accessToken
	 * @param openid
	 * @return
	 */
	public TqqUser otherInfoByName(String name, String accessToken, String openid) {
		String url = new StringBuffer()
			.append(USER_OTHER_INFO_URL)
			.append(tqqApi.getCommonUrl(accessToken, openid))
			.append("&name=").append(name)
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
