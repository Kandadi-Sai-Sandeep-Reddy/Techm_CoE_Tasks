package Tasks;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
//import java.util.Scanner;

public class Task6 {
	
	public static void main(String args[])
	{
		List<Integer> v=new ArrayList<>();
		
		//Scanner sc=new Scanner(System.in);
		v.add(10);
		v.add(11);
		v.add(20);
		v.add(234);
		
		int even= v.stream().filter(n ->n%2==0).mapToInt(n->n).sum();
		int odd= v.stream().filter(n ->n%2!=0).mapToInt(n->n).sum();
		System.out.println("The Sum of even numbers in list is " +even);
		System.out.println("The Sum of odd numbers in list is " +odd);
		//System.out.println("The minimum value in list is " + min);
		//sc.close();
	}

}
