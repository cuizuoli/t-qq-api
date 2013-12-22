/*
 * @(#)TqqEdu.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.model;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * DaLian Software t-qq-api
 * com.tqq.model.TqqEdu.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Data
public class TqqEdu {
	@JsonProperty("departmentid")
	private int departmentId;
	private int id;
	private int level;
	@JsonProperty("schoolid")
	private int schoolId;
	private int year;
}
