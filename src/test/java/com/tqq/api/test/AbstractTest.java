/*
 * @(#)AbstractTest.java $version 2013年12月21日
 *
 * Copyright 2013 DaLian Software. All rights Reserved.
 * DaLian Software PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.tqq.api.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * DaLian Software t-qq-api
 * com.tqq.api.test.AbstractTest.java
 * @author cuizuoli
 * @date 2013年12月21日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:context-tqq.xml", "classpath:context-data.xml"})
public abstract class AbstractTest {

}
