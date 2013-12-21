/*
 * @(#)TqqErrorCode.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.model;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * DaLian Software t-qq-api
 * com.tqq.model.TqqErrorCode.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Data
public class TqqErrorCode {
	private String request;
	private String error;
	@JsonProperty("error_code")
	private String errorCode;
	@JsonProperty("message_code")
	private String messageCode;
}
