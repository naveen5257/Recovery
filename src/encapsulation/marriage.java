package encapsulation;

public class marriage {
private int age;
private String name;
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
	if(age>=21) {
		System.out.println("he is eligeble for the marriage");
	}
	else {
		System.out.println("he is not eligeble for the marriage");
	}
}
public void setName(String name) {
	this.name = name;
}

}
