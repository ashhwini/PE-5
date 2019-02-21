package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountWordsUsingMapTest {

    CountWordsUsingMap obj = new CountWordsUsingMap();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void countWordsUsingMap() {

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("one",5);
        hashMap.put("two",2);
        hashMap.put("three",2);

        assertEquals(hashMap,obj.countWordsUsingMap("one one -one___two,,three,one @three*one?two"));

    }
}