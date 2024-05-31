package Vowels_Consonants_Count;

import java.util.Scanner;

public class VowelConstCount {

	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
		int v,c;
		v=0;
		c=0;
		for(int i=0;i<s.length();++i)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				char a=s.charAt(i);
				if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'
					|| a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
				{
					v=v+1;
				}
				else
				{
					c=c+1;
				}
			}
			else
			{
				
			}
		}
		System.out.println("Vowels Count - "+v);
		System.out.println("Consonants Count - "+c);
	}
}
