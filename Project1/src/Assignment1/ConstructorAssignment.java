package Assignment1;

public class ConstructorAssignment {

	//Default Constructor
	public ConstructorAssignment() {
		this(22,33,44);
		System.out.println("Default Constructor");
	}
	
	//One Parameterized Constructor
	public ConstructorAssignment(int a) {
		this(66,77);
		System.out.println("One Parameterized constructor");
	}
	
	//Two Parameterized Constructor
	public ConstructorAssignment(int a,int b) {
		this();
		System.out.println("Two Parameterized Constructor");
	}
	
	//Three Parameterized Constructor
	public ConstructorAssignment(int a,int b,int c) {
		
		System.out.println("Three parameterized");
	}
	
	public static void main(String[] args) {
		ConstructorAssignment obj=new ConstructorAssignment(12);
		
	}
}
