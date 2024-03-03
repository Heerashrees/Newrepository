package basicprogramms;

public class Oneto500 {
static int i=1;

static void div()
{
	for(i=1;i<500;i++)
	{
		if((i%3)==0)
		{
			System.out.println("computer" +i);
		}
	}
	}

static void div1()
{
	for(i=1;i<500;i++)
	{
		if((i%5)==0)
		{
			System.out.println("mouse" +i);
		}
	}
	
}

static void div2()
{
	for(i=1;i<500;i++)
	{
		if(((i%3)==0) && ((i%5)==0))
		{
			System.out.println("computer & mouse" +i);
		}
		
	}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div();
		div1();
		div2();
	}

}
