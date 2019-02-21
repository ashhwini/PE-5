/*

Write a program to find the number of counts in the following String.
Store the output in Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}

 */


package com.stackroute.unittest;

import java.util.*;

public class CountWordsUsingMap {

    public static Map countWordsUsingMap(String string)
    {
        String[] list = string.split("[^a-z]+");
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(list));

        Map finalValue=new LinkedHashMap();
        Set keys = new LinkedHashSet<>();
        ArrayList al = new ArrayList();

        keys.addAll(arrayList);

        al.addAll(keys);

        int[] count = new int[keys.size()];
        int i=0;


        Iterator itr = keys.iterator();
        while (itr.hasNext()){
            count[i]=Collections.frequency(arrayList,itr.next());
            i++;
        }
        for(int j=0;j<al.size();j++){
            finalValue.put(al.get(j),count[j]);
        }

        return finalValue;

    }

}
