/**
 * Anna Staib
 * CSC 144
 * December 13, 2021
 * Last Exercise
 */

package edu.cornellcollege.lastexercise;

import java.util.ArrayList;
import java.util.List;

public class LastExercise {

    public static boolean foundMatch(int value, List<Integer> list) {
        // TO−DO: Complete the definition of this
        // stub method.
    
        // The completed method will return true its
        // caller if list contains value, and will
        // return false otherwise.
           
        for( int i = 0; i < list.size(); i++) {
            if(list.get(i) == value) {
                return true;
            }
        }
        
        return false;
    } // foundMatch ( int, List<Integer> )

    public static int countMatches(int value, List<Integer> list) {
        // TO−DO: Complete the definition of this
        // stub method.

        // The completed method will return to its
        // caller the number of times that value
        // appears in list.
        
        int count = 0;
        
        for( int i = 0; i < list.size(); i++) {
            if(list.get(i) == value) {
                count++;
            }
        }
        
        return count;
    } // countMatches ( int, List<Integer> )

    public static void main( String[] args) {
        List<Integer> data = new ArrayList<>();

        data.add(34);
        data.add(13);
        data.add(89);
        data.add(55);
        data.add(21);
        data.add(13);

        boolean found = foundMatch(55, data);
        System.out.println( "55 was found in the list: " + found );

        int count = countMatches(13, data);
        System.out.printf( "Found %2d matches to 13 in the list \n" , count );

    } // main ( String[] )

} // LastExercise

