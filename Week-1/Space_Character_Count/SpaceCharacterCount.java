package Space_Character_Count;

import java.util.Scanner;

public class SpaceCharacterCount {
	
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
		int noofchars=0;
		int noofSpaces=0;
		
		for(int i=0;i<s.length();++i)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				noofchars+=1;
			}
			else if(s.charAt(i)==' ')
			{
				noofSpaces+=1;
			}
			else
			{
				
			}
		}
		
		System.out.println("No of Spaces : "+noofSpaces + "and Characters :  " + noofchars);
	}

}
