/*
 * @(#)TqqErrorCodeHandler.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.handler;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;

import com.tqq.model.TqqErrorCode;

/**
 * DaLian Software t-qq-api
 * com.tqq.handler.TqqErrorCodeHandler.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Component
public class TqqErrorCodeHandler {
	public TqqErrorCode handle(HttpStatusCodeException error) {
		TqqErrorCode errorCode = new TqqErrorCode();
		errorCode.setRet(StringUtils.EMPTY);
		errorCode.setErrcode(error.getStatusCode().toString());
		errorCode.setMsg(error.getStatusText());
		return errorCode;
	}
}
