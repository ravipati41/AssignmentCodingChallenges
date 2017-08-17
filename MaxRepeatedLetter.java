package assignment;

public class MaxRepeatedLetter {
public static void main (String[] args) {
	String a= "aabdurttttfffffffffooyudioopeeekkkkkk";
	char[] arr=a.toCharArray();
	int count =0;
	char previous=0;
	int max_value=0;
	char max_char=0;
	char current;
	for(int i=0;i<arr.length;i++) {
		current =arr[i];
	if(current==previous) {
		count++;
	}
	else {
		count=1;
		previous=current;
		
	}
	if(max_value<count) 
	{
		max_value=count;
		max_char=current;
	}
	}
	System.out.println(max_char);
	System.out.println(max_value);
}
}
