/*
 * @(#)TqqUser.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DaLian Software t-qq-api
 * com.tqq.model.TqqUser.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TqqUser extends TqqErrorCode {
	private TqqUserData data;
}
