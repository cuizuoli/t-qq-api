/*
 * @(#)TqqUsersTest.java $version 2013年12月22日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.api;

import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.tqq.api.test.AbstractTest;

/**
 * DaLian Software t-qq-api
 * com.tqq.api.TqqUsersTest.java
 * @author cuizuoli
 * @date 2013年12月22日
 */
public class TqqUsersTest extends AbstractTest {

	@Resource
	private Map<String, String> dataMap;

	@Resource
	private TqqUsers tqqUsers;

	@Test
	public void info() {
		tqqUsers.info(dataMap.get("accessToken"), dataMap.get("openid"));
	}

	@Test
	public void otherInfo() {
		tqqUsers.otherInfo("1200AE49E8B5C82ECF1E7DD37E6FBE8D", dataMap.get("accessToken"), dataMap.get("openid"));
	}

	@Test
	public void otherInfoByName() {
		tqqUsers.otherInfoByName("china394337002", dataMap.get("accessToken"), dataMap.get("openid"));
	}

}
