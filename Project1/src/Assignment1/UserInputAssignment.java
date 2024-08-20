package Assignment1;
import java.util.Scanner;
public class UserInputAssignment {
	//Given Expression
	// (((((x1*x2)+x3)*x4)-x5)/x6)
	public int sum(int n1,int n2) {
		int sum=n1+n2;
		System.out.println("The sum of numbers is :"+ sum);
		return sum;
	}
	
	public int subtract(int l, int m) {
		int sub=l-m;
		System.out.println("The subtraction of numbers is :"+ sub);
		return sub;
	}
	
	public int multiply(int p,int q) {
		int mul=p*q;
		System.out.println("The multiplication of numbers is :"+ mul);
		return mul;
	}
	public void divide(int num1,int num2) {
		int divide=num1/num2;
		System.out.println("The division of numbers is :"+ divide);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int x3=sc.nextInt();
		int x4=sc.nextInt();
		int x5=sc.nextInt();
		int x6=sc.nextInt();	
		UserInputAssignment obj=new UserInputAssignment();
		int a=obj.multiply(x1,x2);
		int b=obj.sum(a,x3);
		int c=obj.multiply(b, x4);
		int d=obj.subtract(c, x5);
		obj.divide(d, x6);
	}	
}
