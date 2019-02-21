package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TrueFalseMapTest {

    TrueFalseMap obj = new TrueFalseMap();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void trueFalseMap() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",true);
        expectedResult.put("two",false);
        assertEquals(expectedResult,obj.trueFalseMap(new String[]{"one","one","two"}));
    }
    @Test
    public void trueFalseMapFailure() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",false);
        expectedResult.put("two",true);
        assertNotEquals(expectedResult,obj.trueFalseMap(new String[]{"one","one","two"}));
        assertNotNull(obj.trueFalseMap(new String[]{"one","one","two"}));
    }
    @Test
    public void trueFalseMaps() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",true);
        expectedResult.put("two",false);
        expectedResult.put("a",true);
        expectedResult.put("@",false);
        expectedResult.put("1",false);
        assertEquals(expectedResult,obj.trueFalseMap(new String[]{"one","one","two","a","a","@","1"}));
    }
    @Test
    public void trueFalseMapsFailure() {
        Map<String,Boolean> expectedResult = new HashMap<String, Boolean>();
        expectedResult.put("one",false);
        expectedResult.put("two",true);
        expectedResult.put("a",false);
        expectedResult.put("@",true);
        assertNotEquals(expectedResult,obj.trueFalseMap(new String[]{"one","one","two","a","a","@"}));
        assertNotNull(obj.trueFalseMap(new String[]{"one","one","two","a","a","@"}));
    }
}


