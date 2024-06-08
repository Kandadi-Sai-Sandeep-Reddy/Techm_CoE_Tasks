package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
	
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		Integer arr[]=new Integer[3];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		//Array.setInt(arr, 0, 0);
		List<Integer> c= new ArrayList<>();
		Collections.addAll(c, arr);
		System.out.println(c);
		//c.iterator();
	}

}
