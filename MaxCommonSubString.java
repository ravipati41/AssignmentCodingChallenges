package assignment;

public class MaxCommonSubString {
public static void main(String[] args) {
	String s1="baabbbxyzxxx";
	String s2="lkiaabxyzxxbbbbu";
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	
	int min_len=0;
	int max_len=0;
	int k=0;
	for(int i=0;i<s1.length();i++) {
		for(int j=0;j<s2.length();j++) {
			if(c1[i]==(c2[j])) {
				k=test(i+1,j+1,c1,c2);
				if(k-i>max_len) {
					max_len=k-i;
					min_len=i;
				
				}
				
			}
		}
	}
System.out.println(s1.substring(min_len,max_len+min_len));
}
public static int test(int a,int b,char[] c1,char[] c2) {
	if(a<c1.length&&b<c2.length) {
		if(c1[a]==c2[b]) {
		return test(a+1,b+1,c1,c2);
			
		}
		else {
			return a;
		}
	}
	
		return a;
	
	
}
}
