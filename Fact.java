package testpractise;
import java.util.Scanner;
public class Fact {
	public static void main(String[] args) {
		
int fact=1;
Scanner s1=new Scanner(System.in);
int num=s1.nextInt();
for(int i=num;i>0;i--)
{
	fact=fact*i;
	}
System.out.println(fact);
	}

}
