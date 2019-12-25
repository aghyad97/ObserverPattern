package test;

public class Student implements Observer{
	String name = "";
	Subject s;
	public Student(String s) {
		// TODO Auto-generated constructor stub
		name = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub
		this.s = s;
		System.out.println("Student " + name + " recieved announcement from faculty");
		System.out.println(((Faculty) s).getName() + " and the new course name is "+
				((Faculty) s).c.name + " for the sem " + ((Faculty) s).c.getSem());
	}
}
