package Class1_assignments;

public class Student {
	int age;
	int rollno;
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[]args) {
		Student obj=new Student();
		obj.age=23;
		obj.rollno=2233;
		System.out.println(obj.age);
		System.out.println(obj.rollno);
		obj.display1();
		obj.display2();
	}
}
