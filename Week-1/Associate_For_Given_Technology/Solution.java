package Associate_For_Given_Technology;

//import Associate_For_Given_Technology.Associate;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.*;

public class Solution {
	
	public static Associate[] associatesForGivenTechnology(Associate obj[], String searchTechnology) 
	{
		//Associate obj1[]=new Associate[2];
		ArrayList<Associate> obj1=new ArrayList<Associate>();
		//int j=-1;
		for(Associate x: obj)
		{
			if(x.getTechnology().equalsIgnoreCase(searchTechnology) && x.getExperienceInYears()%5==0)
			{
				obj1.add(x);
			}
		}
		Associate[] obj2= new Associate[obj1.size()];
		obj2= obj1.toArray(new Associate[0]);
		return obj2;
	}
	
	public static void main(String args[])
	{
		Associate obj[]=new Associate[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;++i)
		{
			obj[i]= new Associate();
			obj[i].setId(sc.nextInt());
			obj[i].setName(sc.next());
			//System.out.println(obj[i].getName());
			obj[i].setTechnology(sc.next());
			//System.out.println(obj[i].getTechnology());
			obj[i].setExperienceInYears(sc.nextInt());
			sc.nextLine();
		}
		
		String searchTechnology=sc.nextLine();
		sc.close();
		//System.out.println(searchTechnology);
		
		Associate obj2[]=associatesForGivenTechnology(obj, searchTechnology);
		
		for(Associate x: obj2)
		{
			System.out.println(x.getId());
		}
	}

}
