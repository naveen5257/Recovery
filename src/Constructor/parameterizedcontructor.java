package Constructor;

public class parameterizedcontructor {
	//parameterized method
	public parameterizedcontructor(int a,int b) {
		// TODO Auto-generated constructor stub
	System.out.println("this is the parameterized constructor");
		
	}
	public parameterizedcontructor() {
		System.out.println("hi this is the no parameter constructor");
		// TODO Auto-generated constructor stub
	}
	

	
	public static void main(String[] args) { 
	

		parameterizedcontructor p=new parameterizedcontructor(1,4);
		parameterizedcontructor p1=new parameterizedcontructor();
	}

}


