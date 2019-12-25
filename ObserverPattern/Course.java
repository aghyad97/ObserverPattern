package test;

public class Course {
	String name = "";
	String sem = "";
	public Course(String n, String s) {
		// TODO Auto-generated constructor stub
		name = n;
		sem = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}

}
