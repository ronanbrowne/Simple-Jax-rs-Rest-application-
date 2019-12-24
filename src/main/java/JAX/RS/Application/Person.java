package JAX.RS.Application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Person {

	private String Name;
	private String City;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
