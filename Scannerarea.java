package basicprogramms;

import java.util.Scanner;

public class Scannerarea {
static double pi=3.14;
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("eneter the value of r");
		int r=s1.nextInt();
		double areaofcircle=pi*r*r;
		System.out.println("areaofcircle is"+areaofcircle);
	}

}
