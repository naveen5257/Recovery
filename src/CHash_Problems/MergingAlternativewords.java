package CHash_Problems;

public class MergingAlternativewords {
	public static String merge(String s1,String s2) {
		StringBuilder result=new StringBuilder();
		for( int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(i<s1.length())
				result.append(s1.charAt(i));
				if(i<s2.length())
					result.append(s2.charAt(j));
			}
			return result.toString();
		
		}
		return s1;
		
	}
public static void main(String[] args) {
String s1="Hello";
String s2="Bro";
System.out.println(merge(s1,s2));
}
}
