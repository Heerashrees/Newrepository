package basicprogramms;

public class Constructmethover {

	 Constructmethover(int c,double d)
	{
		System.out.println("this is constructor overloading1");
	}
	
	 Constructmethover(char a,String b)
	{
		
		System.out.println("this is constructor overloading2");
	}
	
	
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	
	}
	
	static void add(int b,double a)
	{
		int c=5;
		double d=3.5;
		double e=c+d;
		System.out.println(e);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is main method");
		add(1,2);
		add(5,3.7);
		new Constructmethover(3,5.7);
		new Constructmethover('a',"heera");
	}

}
