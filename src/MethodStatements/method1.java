package MethodStatements;

public class method1 {
public method1(int i, int j) {
	System.out.println("hiiiii");
		// TODO Auto-generated constructor stub
	}

//public  static void Demo() {
//	System.out.println("hiiii");
//}
//public static int demo1(int a,int b) {
//	return b;
//	
//}
//public static String demo2() {
//	return null;
//	
//}
//public static void main(String[] args) {
//	demo1(1,2);
//	Demo();
//	demo2();
//	
//}
//}
public static int  demo1(int a,int d) {    //primitive      // called statement  // parameterized method
	System.out.println("hiiii hlo");
	System.out.println(a);
	return a;

}

public static void demo2() { // void   //no argument methods
	

}
public static String demo3() {  // non primitive
	
	return null;
	
	
}

public static void main(String[] args) { //jvm

     demo1(10,20);      //caller /calling //method call statement
  	method1 m=new method1(10,20);
      System.out.println("hi");
}

}


