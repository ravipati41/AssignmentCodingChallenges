package assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateStringsInArray 
{   
    public static void main(String[] args) 
    {
    	//A String array contains some elements with repeated
        String[] strArray = {"abc", "abc","def", "mno", "xyz", "pqr", "xyz", "def","pqr"};
        //create two  ArrayList objects, one for store duplicates and another for non duplicate elements 
        ArrayList<String> ar = new ArrayList<String>();
        ArrayList<String> ar1 = new ArrayList<String>();
        
 //create hash set object to add elements with key value
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
             
             
               ar.add(arrayElement);
               
               }
            else {
            	ar1.add(arrayElement);
            }
              
            }
        System.out.println("the duplicates are: "+ar);
        System.out.println(ar1);
           
        }
    }    
