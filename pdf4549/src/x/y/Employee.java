package x.y;

public class Employee extends Person {
	private String dept;

	
	public Employee(String name, int age, String dept) { //Constructor는 생성자랍니다~
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	void print() {
		System.out.printf("이    름: %s,  나   이:%s,   부      서: %s \n",getName(),getAge(),this.dept);
	}
}
