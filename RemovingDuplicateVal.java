package assignment;

import java.util.Arrays;

public class RemovingDuplicateVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] input= {1,1,3,7,7,8,9,9,10,2,9,10};
	Arrays.sort(input);
	int current=input[0];
	Boolean found=false;
	for(int i=0;i<input.length;i++) {
	
		if(current==input[i] && !found) {
			
			current=input[i];
			found=true;
			
			
		}
		
		else if(current!=input[i]) {
			System.out.println(current);
			current=input[i];
			found=false;
		}
	}
	System.out.println(current);

	}

}
