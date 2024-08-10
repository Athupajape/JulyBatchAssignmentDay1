package Assignment1;

public class MethodAssignment {

	//Default Method
	public void Defaultmethod1() {
		this.Method3(88, 99, 110);
		System.out.println("default method");
	}
	
	//One Parameterized Method
	public void Method1(int a) {
		this.Defaultmethod1();
		System.out.println("one parameterized method");
	}
	
	//Two Parameterized Method
	public void Method2(int b,int c) {
		this.Method1(77);
		System.out.println("two parameterized method");
	}
	
	//Three Parameterized Method
	public void Method3(int p,int q,int r) {	
		System.out.println("three parameterized method");
	}

	//Four Parameterized Method
	public void Method4(int m,int n,int z, int y) {
		this.Method2(55,66);
		System.out.println("four parameterized method");
		
	}
	
	public static void main(String[] args) {
		MethodAssignment ob=new MethodAssignment();
		ob.Method4(11,22,33,44);
	}
	
	
}
