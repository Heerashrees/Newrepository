package basicprogramms;

import java.util.Scanner;


public class Scannerglob {
	
	
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the value of no1:");
	int no1=s1.nextInt();
	System.out.println("enter the value of no2:");
	int no2=s1.nextInt();
	int sum=no1+no2;
	System.out.println(sum);
	int sub=no2-no1;
	System.out.println(sub);
	
	}

}
