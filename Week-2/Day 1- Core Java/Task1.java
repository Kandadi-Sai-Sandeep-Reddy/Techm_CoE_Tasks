package Tasks;

import java.util.Collections;
import java.util.Vector;
//import java.util.Scanner;

public class Task1 {
	
	public static void main(String args[])
	{
		Vector<Integer> v=new Vector<Integer>();
		
		//Scanner sc=new Scanner(System.in);
		v.add(10);
		v.add(11);
		v.add(20);
		v.add(234);
		
		int max= Collections.max(v);
		System.out.println("The maximum value in vector is " +max);
		
		//sc.close();
	}

}
