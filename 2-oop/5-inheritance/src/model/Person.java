package model;
public class Person {
	private String name;
	protected int age;
	protected float height;

	public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String fullInfo() {
		return "Name: " + this.getName() + " Age: " + this.getAge() + " Height: " + this.getHeight();
	}
	
}