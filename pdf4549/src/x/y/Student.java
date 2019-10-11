package x.y;

public class Student extends Person {
	private int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void print() {
		System.out.printf("이    름: %s,  나   이:%s,   학      번: %s \n",getName(),getAge(),this.id);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name="+getName()+", age="+getAge()+"]";
	}
	
}

