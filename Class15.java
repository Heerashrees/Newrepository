package basicprogramms;
public class Class15 
{	
	Class15(int a)
	{
	System.out.println("Constructor1");
	
	}
	/*Class15()
	{
		System.out.println("Constructor2");
	}*/
	static //sib
	{
		System.out.println("this is SIB1");
	}
	static //sib
	{
		System.out.println("this is SIB2");
	}
	{//iib
		System.out.println("this is IIB");
	}
	public static void main(String[] args) //main method
	{
		new Class15(5);
		//new Class15();
		System.out.println("Main method");
	}

}
//sib->main method->iib->constrycyor