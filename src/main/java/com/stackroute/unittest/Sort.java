/*

Write a program to implement set interface which sorts the given randomly ordered names in ascending order.
Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output : Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive

 */

package com.stackroute.unittest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sort {

    public Set<Object> sort(Set name) {
        Set<String> value = new TreeSet<String>();
        value.addAll(name);


        ArrayList al = new ArrayList();
        al.addAll(value);

        Set<Object> objects = new LinkedHashSet<>();
        objects.add(value);
        objects.add(al);


        return objects;
    }

}
