package singlelevelInheritance;

public class Son  extends Father{
int j=20;
String s1="Kumar";
public static void main(String[] args) {
	Son son=new Son();
	System.out.println(son.j);
	System.out.println(son.name); // 
	System.out.println(son.s1);
	System.out.println(son.i);
Father fat=new Father();
	System.out.println(fat.i);
	System.out.println(fat.name);
	//System.out.println(fat.j);// parent class can't inherit properties from the child
}
}
