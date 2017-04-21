package com.yulu.zhaoxinpeng.junittestdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/4/20.
 */
public class RegexUtilsTest {

    private RegexUtils mRegexUtils;

    @Before
    public void setUp() throws Exception {
        mRegexUtils = new RegexUtils();
    }

    @After
    public void tearDown() throws Exception {
        mRegexUtils=null;
    }

    @Test
    public void verifyUsername() throws Exception {
        int verifyUsername = mRegexUtils.verifyUsername("123123");
        assertEquals(0,verifyUsername);
    }

    @Test
    public void verifyPassword() throws Exception {
        int verifyPassword = mRegexUtils.verifyPassword("123123");
        assertEquals(0,verifyPassword);
    }

    @Test
    public void verifyNickname() throws Exception {

    }

}