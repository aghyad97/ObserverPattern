package test;

import java.util.ArrayList;

public class Faculty implements Subject{
	String name = "";
	Course c;
	private ArrayList<Observer> observers;
	public Faculty(String s) {
		// TODO Auto-generated constructor stub
		name = s;
		observers = new ArrayList<Observer>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void newAnnouncement(Course s) {
		c = s;
		notifyObservers();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	@Override
	public void removeObsever(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++) {
			observers.get(i).update(this);
		}
	} 
}
