package superclass;

public class callingdata {
String name;
int a;
//public  static void demo(String name,int a) using static becomes the error beacuse this keyword is an non static
public void demo(String name,int a) {
	this.a=a;
	this.name=name;
	System.out.println(name);
	System.out.println(a);
}
public static void main(String[] args) {
	callingdata d=new callingdata();
	
	d.demo("naveen",10);
}
}
