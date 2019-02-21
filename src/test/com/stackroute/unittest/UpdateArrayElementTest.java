package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateArrayElementTest {

    UpdateArrayElement obj = new UpdateArrayElement();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void updateArrayElement() {
        ArrayList<String> input = new ArrayList<String>();

        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");

        assertEquals(input,obj.updateArrayElement(input,"Apple","Kiwi"));


    }
}