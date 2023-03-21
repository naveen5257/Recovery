package CHash_Problems;

public class spattern {
public static void main(String[] args) {
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++ ) {
			if(row==1||row==3||row==6)
			System.out.print("*");
					else if(row<3 && col==1)
				System.out.print("*");
					else  if(row>3 && col==6)
						System.out.print("*");
					else
			System.out.print(" ");
			}
		System.out.println(" ");
	
		
	}
	System.out.println("------------------------------");
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==1||col==6||row==6)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println(" ");
	}
	System.out.println("--------------------------");
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(row==1||row==3||row==6)
				System.out.print("*");
			else if(row<3&&col==1)
				System.out.print("*");
			else if(row>3&&col==6)
				System.out.print("*");
			else
				System.out.print(" ");
	}
	System.out.println(" ");
}
System.out.println("--------------------------");
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==1||col==6||row==3)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println(" ");
	}
	System.out.println("---------------------------");
	for(int row=1;row<=6;row++) {
		for(int col=1;col<=6;col++) {
			if(col==1||row==col/2)
			
				
				System.out.print("*");
			else if(col>3&&col==row)
				System.out.print("*");
			else
			System.out.print(" ");
			
		}
		System.out.println(" ");
	}
	
}}
	





