package Smallest_Vowel_in_a_String;

import java.util.Scanner;

public class SmallestVowel {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		str.toLowerCase();
		
		if(str.contains("a"))
		{
			System.out.println("a");
		}
		else if(str.contains("e"))
		{
			System.out.println("e");
		}
		else if(str.contains("i"))
		{
			System.out.println("i");
		}
		else if(str.contains("o"))
		{
			System.out.println("o");
		}
		else if(str.contains("u"))
		{
			System.out.println("uu");
		}
		else
		{
			
		}
	}

}
