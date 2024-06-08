package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
	
	public static void main(String args[])
	{
		List<Integer> v=new ArrayList<>();
		
		//Scanner sc=new Scanner(System.in);
		v.add(10);
		v.add(11);
		v.add(20);
		v.add(234);
		
		double a= v.stream().mapToDouble(n ->n).average().getAsDouble();
		
		System.out.println("average by using Stream : " + a);
	}

}