/*

Create a Student class that represents the following information of a student: id, name, and age all the member variables should be private .

Write a class `MainTest` create Student class object(minimum 5)
Add these student object into a List of type Student .
Sort the list based on their age in decreasing order, for student having same age, sort based on their name.
For students having same name and age, sort them according to their ID.

 */

package com.stackroute.unittest;

import java.util.*;

public class MainTest {
    public List afterComparision(List student){
        StudentSorter so = new StudentSorter();
        Collections.sort(student,so);
        return student;
    }
}
