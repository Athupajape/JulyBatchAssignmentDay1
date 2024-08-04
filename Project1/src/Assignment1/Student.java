package Assignment1;

public class Student {
	//variable declaration 
	int age;
	int rollNo;
	
	//Method declaration
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	
	// Method declaration
	public void display2() {
		System.out.println("Automation is very easy");
	}
	
	//Main Method
	public static void main(String[] args) {
		
		//Object creation
		Student s1=new Student();
		s1.display1();
		s1.display2();
		s1.rollNo=22;
		s1.age=25;
		System.out.println("Roll No is : "+ s1.rollNo);
		System.out.println("Age is : "+ s1.age);
		
	}
	
}
