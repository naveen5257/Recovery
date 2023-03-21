package Multilevelinheritance;

public class son  extends Father{
int k=1;
String s1="Prabhas";
public static void main(String[] args) {
	son s = new son();
	System.out.println(s.i);
	System.out.println(s.j);
	System.out.println(s.k);
	System.out.println(s.name);
	System.out.println(s.s);
	System.out.println(s.s1);
}
}
