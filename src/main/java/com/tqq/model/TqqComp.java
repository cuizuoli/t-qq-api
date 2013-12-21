/*
 * @(#)TqqComp.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.model;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * DaLian Software t-qq-api
 * com.tqq.model.TqqComp.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Data
public class TqqComp {
	@JsonProperty("begin_year")
	private int beginYear;
	@JsonProperty("company_name")
	private String companyName;
	@JsonProperty("department_name")
	private String departmentName;
	@JsonProperty("end_year")
	private int endYear;
	private int id;
}
