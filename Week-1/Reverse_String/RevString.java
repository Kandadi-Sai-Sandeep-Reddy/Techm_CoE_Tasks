package Reverse_String;

import java.util.Scanner;

public class RevString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		sc.close();
		//str.toLowerCase();
		StringBuilder str1= new StringBuilder(str.length());
		str1.append(str);
		str1.reverse();
		str= str1.toString();
		System.out.println(str.toLowerCase());
	}

}
