package test;

public class Driver {
	public static void main(String[] args) {
		Faculty f1 = new Faculty("Dr. X");
		Faculty f2 = new Faculty("Dr. Y");
		Student s1 = new Student("Jo");
		Student s2 = new Student("Mo");
		f1.registerObserver(s1);
		f1.registerObserver(s2);
		f1.newAnnouncement(new Course("COE 000", "Fall 2020"));
		f2.registerObserver(s1);
		f2.registerObserver(s2);
		f2.newAnnouncement(new Course("COE 111", "Fall 2020"));
	}
}
