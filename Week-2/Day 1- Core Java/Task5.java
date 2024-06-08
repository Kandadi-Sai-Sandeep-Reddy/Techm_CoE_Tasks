package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
	
	public static void main(String args[])
	{
		List<String> s=new ArrayList<>();
		s.add("APPLE");
		s.add("Banana");
		s.add("Cherry");
		
		s.stream().map(str ->str.toLowerCase()).forEach(System.out::println);
	}

}
