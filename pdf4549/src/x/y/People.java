package x.y;

import java.util.List;

public class People {
	List<Person> list;
	public People() {
		
	}
	
	public People(List<Person> list) {
		this.list=list;
	}
	
	public List<Person> getList() {
		return list;
	}

	public void setList(List<Person> list) {
		this.list = list;
	}

	public void addPerson(Person person) {
		list.add(person);
	}
/*
	@Override
	public String toString() {
		return list.toString();
	}
*/	
	public void print() {
		list.forEach(i->System.out.println(i));
	}
}
