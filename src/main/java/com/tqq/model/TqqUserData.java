/*
 * @(#)TqqUserData.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.model;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * DaLian Software t-qq-api
 * com.tqq.model.TqqUserData.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Data
public class TqqUserData {
	@JsonProperty("birth_day")
	private int birthDay;
	@JsonProperty("birth_month")
	private int birthMonth;
	@JsonProperty("birth_year")
	private int birthYear;
	@JsonProperty("city_code")
	private int cityCode;
	private TqqComp[] comp;
	@JsonProperty("country_code")
	private int countryCode;
	private TqqEdu[] edu;
	private int fansnum;
	private int favnum;
	private String head;
	@JsonProperty("homecity_code")
	private int homecityCode;
	@JsonProperty("homecountry_code")
	private int homecountryCode;
	private String homepage;
	@JsonProperty("homeprovince_code")
	private int homeprovinceCode;
}
