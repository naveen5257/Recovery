package CHash_Problems;

import java.util.Scanner;

public class forloap1 {
public static void main(String[] args) {
	int a[][]=new int [2][2];
	int b[][]=new int [2][2];
	int c[][]=new int [2][2];
	System.out.print("Enter the first matrix");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			a[i][j]=sc.nextInt();
			
		}
	}
	System.out.print("Enter the second matrix");
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			b[i][j]=sc.nextInt();
		}
	}
	System.out.println("First Matrix ");
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.println(a[i][j]+" ");
		}
		System.out.print("");
	}
	System.out.println("Second Matrix");
	for(int i=1;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.println(b[i][j]+" ");
		}
		System.out.print("");
	}
	System.out.println("sum of Two matrix");
	for(int i=1;i<=2;i++) {
		for(int j=1;j<=2;j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.println(c[i][j]+" ");
		}
		System.out.print(" ");
	
	}
}
}
