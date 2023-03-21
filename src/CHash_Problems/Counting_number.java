package CHash_Problems;

import java.util.Scanner;

public class Counting_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char yes='y';
	
	int count=0,psv=0,ngv=0,zero=0;
	while(yes=='y'||yes=='Y') {
		count++;
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num==0)
			zero++;
		else if(num>0)
			psv++;
		else if(num<0)
			ngv++;
		System.out.println("do you want enter the another number(y/n):"+" ");
		yes=sc.next().charAt(0);
		
	}
	System.out.println("number of entrties"+count);
	System.out.println("number of zero"+zero);
	System.out.println("number of postive values"+psv);
	System.out.println("number of negative number"+ngv);
}
}
