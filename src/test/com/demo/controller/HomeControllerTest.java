package com.demo.controller;

import junit.framework.TestCase;

/**
 * Created by jdqi-win on 2017/12/31.
 */
public class HomeControllerTest extends TestCase {
    public void testIndex() throws Exception {
        HomeController  h = new HomeController();
        assertEquals("hello",(h.index()));
    }

}