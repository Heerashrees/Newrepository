package mypractises;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		if(a<b && a!=b)
		{
			int sum=a+b;
			System.out.println(sum);
		}
		if(a<b && a==b)
		{
			System.out.println("this is the condition for T & F");
		}
		if(a>b && a!=b)
		{
			System.out.println("this is the condition for F & T");
		}
		if(a>b && a==b)
		{
			System.out.println("this is the condition for F & F");
		}
	}

}
