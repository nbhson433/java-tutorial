package model;

public class Student extends Person {
	private String academicAbility;
	private float pointLadder;
	
	public Student(String name, int age, float height, String academicAbility, float pointLadder) {
		super(name, age, height);
		this.academicAbility = academicAbility;
		this.pointLadder = pointLadder;
	}

	public int getAgeFromPerson() {
		return this.age;
	}
	public String getAcademicAbility() {
		return academicAbility;
	}

	public void setAcademicAbility(String academicAbility) {
		this.academicAbility = academicAbility;
	}

	public float getPointLadder() {
		return pointLadder;
	}

	public void setPointLadder(float pointLadder) {
		this.pointLadder = pointLadder;
	}
	
}
