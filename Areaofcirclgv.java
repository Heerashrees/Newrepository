package basicprogramms;
public class Areaofcirclgv {
final static double pi=3.14;
static void circle()
{
	int r=5;
	double a = pi*r*r;
	System.out.println(a);
	}

static void triangle()
{
	int b=5;
	int h=5;
	double area =0.5 *(b*h);
	System.out.println(area);
	}

static void rectangle()
{
	int l=5;
	int w=10;
	int area =l*w;
	System.out.println(area);
	}

static void square()
{
	int a=5;
	int area =a*a;
	System.out.println(area);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle();
		triangle();
		rectangle();
		square();
	}
}
