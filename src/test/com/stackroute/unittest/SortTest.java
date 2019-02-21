package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortTest {

    Sort obj = new Sort();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sort() {
        Set<String> names=new HashSet<String>();
        names.add("Harry");
        names.add("Olive");
        names.add("Alice");
        names.add("Bluto");
        names.add("Eugene");
        Set<String> nameList = new LinkedHashSet<String>();
        nameList.add("Alice");
        nameList.add("Bluto");
        nameList.add("Eugene");
        nameList.add("Harry");
        nameList.add("Olive");

        ArrayList<String> al = new ArrayList<>();
        al.addAll(nameList);

        Set<Object> objects = new LinkedHashSet<>();
        objects.add(nameList);
        objects.add(al);

        assertEquals(objects,obj.sort(names));
    }
}