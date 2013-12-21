/*
 * @(#)TqqOAuth2Test.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.api;

import javax.annotation.Resource;

import org.junit.Test;

import com.tqq.api.test.AbstractTest;

/**
 * DaLian Software t-qq-api
 * com.tqq.api.TqqOAuth2Test.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
public class TqqOAuth2Test extends AbstractTest {

	@Resource
	private TqqOAuth2 tqqOAuth2;

	@Test
	public void authorize() {
		tqqOAuth2.authorize("test");
	}

}
