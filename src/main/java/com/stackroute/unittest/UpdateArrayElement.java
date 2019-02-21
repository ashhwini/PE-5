/*

Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []

 */



package com.stackroute.unittest;

import java.util.ArrayList;

public class UpdateArrayElement {

    public ArrayList<String> updateArrayElement(ArrayList<String> input , String element1 , String element2)
    {
        System.out.println(input);
        //get the index of element1
        int index = input.indexOf(element1);

        //replace element1 with element2
        input.set(index,element2);
        System.out.println(input);

        //empty the ArrayList
        input.clear();
        System.out.println(input);


        return input;
    }

}
