package basicprogramms;
import java.util.Scanner;
public class Scannermethods {
	static void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		System.out.println("Enter the value of b:");
		int b=s1.nextInt();
		int add=a+b;
		System.out.println(add);	
	}
	static void sub()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		System.out.println("Enter the value of b:");
		int b=s1.nextInt();
		int sub=b-a;
		System.out.println(sub);
		
	}
	static void mul()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		System.out.println("Enter the value of b:");
		int b=s1.nextInt();
		int mul=a*b;
		System.out.println(mul);
		
	}
	static void div()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		System.out.println("Enter the value of b:");
		int b=s1.nextInt();
		int div=b/a;
		System.out.println(div);
		
	}

	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		div();
	}

}
