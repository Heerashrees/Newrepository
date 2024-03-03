package casting;
class College{
	void college()
	{
		System.out.println("college");
	}
}
class Highschool extends College{
	void highschool()
	{
		System.out.println("Highschool");
	}
}
class Primary extends Highschool{
	void primary()
	{
		System.out.println("Primary");
	}	
}
public class Nursery extends Primary {
	void student()
	{
		System.out.println("Student");
	}
public static void main(String[] args) {
		College c1=new Highschool();//upcasting
		c1.college();
		Highschool h1=new Primary();//Inorder to downcast first we need to upcast
		Primary p1=(Primary)h1;
		p1.highschool();
		p1.primary();
		
		

	}

}
