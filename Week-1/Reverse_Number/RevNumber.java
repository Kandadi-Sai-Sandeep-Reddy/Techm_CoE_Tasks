package Reverse_Number;

import java.util.Scanner;

public class RevNumber {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int rev=0,x=0;
		while(num!=0)
		{
			x=num%10;
			rev=rev*10+x;
			num=num/10;
		}
		System.out.println(rev);
	}

}
