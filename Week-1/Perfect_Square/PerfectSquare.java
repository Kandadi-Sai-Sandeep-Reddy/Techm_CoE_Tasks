package Perfect_Square;

import java.util.Scanner;


public class PerfectSquare {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double b= Math.sqrt(a);
		if(Math.floor(b)==b)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}

}
