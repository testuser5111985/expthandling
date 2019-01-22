package pkg1;
public class string2 {	
public static void main(String[] args) {
		String str="This needs to test";
		int len=str.length();
		int count=0;
		for(int j=0;j<len-1;j++) {
			//System.out.println(str.charAt(j));	
		if(str.charAt(j)=='e') {
			count++;			
		}
		}
		System.out.println("String is: " +str);
		System.out.println("occournace of e: " +count); 
	}
}
