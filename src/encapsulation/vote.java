package encapsulation;

public class vote {
private int age;
private  String name;

// getters method
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
//setters method
	public void setAge(int age) {
		this.age = age;
		if(age>=18) {
			System.out.println("The person is eligeble");
		}
		else {
			System.out.println("not eleigble");
		}
	}
	public void setName(String name) {
		this.name = name;
}

}
