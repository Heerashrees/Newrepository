package Abstract;
abstract class Country{
	abstract void nh_road();
	 void country()
	{
		System.out.println("this abstract method");
	}
	
}

public class City_class extends Country {

	public static void main(String[] args) {
		City_class c1=new City_class();
		c1.country();
		c1.nh_road();

	}
	void nh_road()
	{
		System.out.println("this is nh_road");
	}
	
}
