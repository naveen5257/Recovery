package CHash_Problems;

public class fourletterofmyname {
public static void main(String[] args) {
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==1||col==6||row==col)
			System.out.print("*");
			else
				
		System.out.print(" ");
	}
		
	System.out.println("");

	}
	System.out.println("--------------------------------------");

	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==1||col==6||row==1||row==3)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		
	
	System.out.println(" ");
}
	
	System.out.println("-------------------------------");
	
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==row||col==6)
				System.out.print("*");
			else
				System.out.print(" ");
			}
		System.out.println("");
		
		}
	
		
	
	System.out.println("--------------------------------");
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==1||row==1||row==3||row==6)
				System.out.print("*");
			else
		System.out.print(" ");
	}
		System.out.println("");
	}

	System.out.println("--------------------------------");
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==1||row==1||row==3||row==6)
				System.out.print("*");
			else
		System.out.print(" ");
	}
		System.out.println("");
	}
	System.out.println("--------------------------------");
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==1||col==6||row==col)
			System.out.print("*");
			else
				
		System.out.print(" ");
	}
		
	System.out.println("");

	}
}
}

