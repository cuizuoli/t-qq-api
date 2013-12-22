/*
 * @(#)TqqTweetInfo.java $version 2013年12月22日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * DaLian Software t-qq-api
 * com.tqq.model.TqqTweetInfo.java
 * @author cuizuoli
 * @date 2013年12月22日
 */
@Data
public class TqqTweetInfo {
	@JsonProperty("city_code")
	private String cityCode;
	@JsonProperty("country_code")
	private String countryCode;
	@JsonProperty("emotiontype")
	private int emotionType;
	@JsonProperty("emotionurl")
	private String emotionUrl;
	private String from;
	@JsonProperty("fromurl")
	private String fromUrl;
	private String geo;
	private String id;
	private String[] image;
	private String latitude;
	private String location;
	private String longitude;
	private String music;
	@JsonProperty("origtext")
	private String origText;
	@JsonProperty("province_code")
	private String provinceCode;
	private int self;
	private int status;
	private String text;
	private Date timestamp;
	private int type;
	private String video;
}
