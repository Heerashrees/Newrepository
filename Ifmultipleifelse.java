package basicprogramms;

public class Ifmultipleifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int b=5;
		int c=3;
		if (a>b)
		{
		  if(b<c)
		  {
			  System.out.println(b);
		  }
		  else
		  {
			 if(a<c)
			 {
				 System.out.println(a);
			 }
			 else
			 {
				 if(a>0)
				 {
					 System.out.println("the number is positive");
				 }
				 else
				 {
					 System.out.println("the number is negative");
				 }
			 }
		  }
		  
		}
	}

}
