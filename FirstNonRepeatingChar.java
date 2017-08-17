package assignment;

import java.util.Arrays;
import java.util.HashMap;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="AABCCDEABDEFGHIJKLMNNMKLGF";
		
	String[] charArr=s.split("");
	Arrays.sort(charArr);
	int count=0;
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	
	for(int i=0;i<charArr.length;i++) {
		
		String s1=charArr[i];
		if(!hm.containsKey(s1)) {
			hm.put(s1, 1);
			count=1;
		 
		}
		else {
			count=count+1;
			hm.put(s1, count);
			
		}
	}
	System.out.println(hm);
				
for(int i=0;i<charArr.length;i++) {
	String s2=charArr[i];
	if(hm.get(s2)==1) {
		System.out.println(" THE FIRST NON REPEATING CHARECTER IS:  "+s2 );
		break;
	}
}
	}

}
