/*
 * @(#)TqqErrorCodeHandler.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.handler;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;

import com.tqq.model.TqqErrorCode;

import lombok.extern.slf4j.Slf4j;

/**
 * DaLian Software t-qq-api
 * com.tqq.handler.TqqErrorCodeHandler.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Slf4j
@Component
public class TqqErrorCodeHandler {
	public TqqErrorCode handle(HttpStatusCodeException error) {
		ObjectMapper objectMapper = new ObjectMapper();
		TqqErrorCode errorCode = new TqqErrorCode();
		errorCode.setRequest(StringUtils.EMPTY);
		errorCode.setErrorCode(error.getStatusCode().toString());
		errorCode.setError(error.getStatusText());
		try {
			errorCode = objectMapper.readValue(error.getResponseBodyAsByteArray(), TqqErrorCode.class);
		} catch (JsonParseException e) {
			log.error(ExceptionUtils.getFullStackTrace(e));
		} catch (JsonMappingException e) {
			log.error(ExceptionUtils.getFullStackTrace(e));
		} catch (IOException e) {
			log.error(ExceptionUtils.getFullStackTrace(e));
		}
		return errorCode;
	}
}
