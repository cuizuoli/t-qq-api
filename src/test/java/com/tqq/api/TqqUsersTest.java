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
	public void otherInfo() {
		tqqUsers.otherInfo("china394337002", dataMap.get("accessToken"), dataMap.get("openid"));
	}

}
