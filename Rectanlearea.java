package basicprogramms;

public class Rectanlearea {

  static void add(int a,int b)
  {
	  int l=10;
		int d=2;
		int c=l*d;
		System.out.println(c);
		System.out.println("the value of c is the area of rectangle");
	  
  }
  static void add()
  {
	  int b=2;
	  int h=5;
	  double i=0.5*b*h;
	  System.out.println(i);
		System.out.println("the value of i is the area of triangle");
  }
  
  static void add(int m)
  {
	  int p=2;
	  int b=p*p;
	  System.out.println(b);
		System.out.println("the value of b is the area of square");
  }
  
  static void add(char a)
  {
	  int r=2;
	  double pi=3.14;
	  double z=pi*r*r;
	  System.out.println(z);
		System.out.println("the value of z is the area of circle");
  }
  
  Rectanlearea()
  {
	int r =5;
	double pi=3.14;
	double c=2*pi*r;
	System.out.println(c);
	System.out.println("c is the circumference of circle");
  }
  
  Rectanlearea(int a)
  {
	int r =5;
	int p=4*r;
	System.out.println(p);
	System.out.println("p is the perimeter of square");
  }
  
  Rectanlearea(String a)
  {
	int l =5;
	int w =3;
	int c=(l+w)*2;
	System.out.println(c);
	System.out.println("c is the perimeter of rectangle");
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,2);
		add();
		add(6);
		add('A');
		new Rectanlearea();
		new Rectanlearea('a');
		new Rectanlearea("heera");
	}
	

}
