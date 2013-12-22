/*
 * @(#)TqqUserData.java $version 2013年12月21日
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
	private String countryCode;
	private TqqEdu[] edu;
	private String email;
	private int exp;
	@JsonProperty("fansnum")
	private int fansNum;
	@JsonProperty("favnum")
	private int favNum;
	private String head;
	@JsonProperty("homecity_code")
	private String homeCityCode;
	@JsonProperty("homecountry_code")
	private String homeCountryCode;
	private String homepage;
	@JsonProperty("homeprovince_code")
	private String homeProvinceCode;
	@JsonProperty("hometown_code")
	private String homeTownCode;
	@JsonProperty("https_head")
	private String httpsHead;
	private int idolnum;
	@JsonProperty("industry_code")
	private int industryCode;
	private String introduction;
	private int isent;
	@JsonProperty("ismyblack")
	private int isMyBlack;
	@JsonProperty("ismyfans")
	private int isMyFans;
	@JsonProperty("ismyidol")
	private int isMyIdol;
	@JsonProperty("isrealname")
	private int isRealName;
	@JsonProperty("isvip")
	private int isVip;
	private int level;
	private String location;
	@JsonProperty("mutual_fans_num")
	private int mutualFansNum;
	private String name;
	private String nick;
	private String openid;
	@JsonProperty("province_code")
	private String provinceCode;
	@JsonProperty("regtime")
	private Date regTime;
	@JsonProperty("send_private_flag")
	private int sendPrivateFlag;
	private int sex;
	private TqqTag[] tag;
	@JsonProperty("tweetinfo")
	private TqqTweetInfo[] tweetInfo;
	@JsonProperty("tweetnum")
	private int tweetNum;
	@JsonProperty("verifyinfo")
	private String verifyInfo;

}
