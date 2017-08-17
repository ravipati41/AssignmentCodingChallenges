package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DupliArr {

	public static void main(String[] args)
	{
		int[] numbers = { 5, 1, 23, 2, 1, 6, 3, 1, 8, 12, 3 , 5, 6 };
		Arrays.sort(numbers);
		int count=0;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
		for(int i = 1; i<numbers.length; i++) {
			int a=numbers[i];
		    if(!hm.containsKey(a)) {
		    	hm.put(a, 1);
		    	count=1;
		    	
		    }
		    else {
		  count=count+1;
		   hm1.put(a, count);
		    }
		}
		//System.out.println(duplicate);
		//System.out.println(notRepeted);
		System.out.println("map not contain duplicate values:"+hm);
		System.out.println("The duplicates are:"+hm1);
	}
}
