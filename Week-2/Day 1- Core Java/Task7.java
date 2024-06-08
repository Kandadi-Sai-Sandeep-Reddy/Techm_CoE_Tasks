package Tasks;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
//import java.util.stream.Stream;
//import java.util.Scanner;

public class Task7 {
	
	public static void main(String args[])
	{
		List<Integer> v=new ArrayList<>();
		
		//Scanner sc=new Scanner(System.in);
		v.add(10);
		v.add(11);
		v.add(20);
		v.add(234);
		
		Integer max = v.stream().max(Integer::compare).get(); 
		Integer min = v.stream().min(Integer::compare).get();
		
		System.out.println("The maximum value in list is " + max);
		System.out.println("The minimum value in list is " + min);
		//sc.close();
	}

}