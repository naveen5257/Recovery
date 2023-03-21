package superclass;

public class son  extends father{
son(){
//	super();
	super.name="kumar"; // we are modify the data from sub to superclass
	System.out.println(name);
}
public static void main(String[] args) {
	son s=new son();// constructor calling
}
}
