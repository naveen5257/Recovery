package superclass;

public class recurreciveusingthisOperator {
recurreciveusingthisOperator(int a,int b){
	
	System.out.println("hi this is the first daughter");
}

recurreciveusingthisOperator(int a){
	this(1,2);
	System.out.println(this);
	System.out.println("this is the integer value");
}
 recurreciveusingthisOperator() {
	 this(10);
	 System.out.println("zero parameter constructor");
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	recurreciveusingthisOperator d=new recurreciveusingthisOperator(); //  calling zero parameter constructor
}
}

