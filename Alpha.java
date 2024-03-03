package stringpackage;

import java.util.Arrays;

public class Alpha {

	public static void main(String[] args) {
		String input="world is full of beautiful people";
		int noofalpha=0;
		char c[]=input.toCharArray();
		System.out.println(c);
		Arrays.sort(c);
		for(int i=0;i<input.length();i++)
		{
			Boolean answer=Character.isAlphabetic(c[i]);
					if(answer==true)
					{
						noofalpha++;
					}
					
		}
		System.out.println("the number of alphabets is" +noofalpha);
		System.out.println(Arrays.toString(c));
	}

}
