package basicprogramms;

public class Methodoverl {
	
	static void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	static void add(double a,int b)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		System.out.println("this is method overloading");
		Methodoverl m1= new Methodoverl();
		add(1.2,5);
		add(1,5);
		m1.add(1,2,3);
		
	}
	
 void add(int a,int b,int c)
 {
	 System.out.println(true);
 }
}

