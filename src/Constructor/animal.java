package Constructor;

public class animal {
String name;
int a;
int b;
public animal(int a, int b) {
	this.a=a;
	this.b=b; // when ever we dont cal this the global variable converts local and its its will take the values inside scope only outside scope i mean demo method it it will take null values until we cal "this operator with in constructor"
	System.out.println(a);
	System.out.println(b);
}
public void demo() {
	
	System.out.println(a+" "+b);
}
public static void main(String[] args) {
	animal a=new animal(10,20);
	a.demo();
	
}
	
}

