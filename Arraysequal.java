package newpractise;

import java.util.Arrays;

public class Arraysequal {

	public static void main(String[] args) {
	int a[]=new int[3];
	int b[]=new int[3];
	a[0]=12;
	a[1]=85;
	a[2]=78;
	b[0]=45;
	b[1]=85;
	b[2]=74;
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	if(Arrays.equals(a, b))
	{
		System.out.println("Arrays are equal");
	}
	else
	{
		System.out.println("Arrays are not equal");
	}
	}

}
