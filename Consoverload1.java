package basicprogramms;
//Construtor overlaoding with  no parameter int,boolean,strin,char
public class Consoverload1 {
	Consoverload1()
	{
		System.out.println(" no parameter");
	}
	
	Consoverload1(int a)
	{

		System.out.println("int a");
	}
	
	Consoverload1(boolean a)
	{
	
		System.out.println("boolean a");
	}
	
	Consoverload1(String a)
	{
	
		System.out.println("String a");
	}
	
	Consoverload1(char a)
	{
	
		System.out.println("char a");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		new Consoverload1();
		new Consoverload1(5);
		new Consoverload1(false);
		new Consoverload1("string");
		new Consoverload1('a');
	}

}
