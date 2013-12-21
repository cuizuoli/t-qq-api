/*
 * @(#)Wap.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.enums;

/**
 * DaLian Software t-qq-api
 * com.tqq.enums.Wap.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
public enum Wap {
	WAP1("1"),
	WAP2("2");
	private final String code;

	private Wap(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
