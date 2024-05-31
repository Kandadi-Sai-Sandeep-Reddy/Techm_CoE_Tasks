package Sim_Transfer_Circle;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution implements Comparator<Sim>{
	
	public static Sim[] transferCircle(Sim[] obj, String circle1, String circle2)
	{
		ArrayList<Sim> arraylist
        = new ArrayList<Sim>();
		for(Sim x: obj)
		{
			String circle= x.getCircle();
			if(circle.equals(circle1))
			{
				x.setCircle(circle2);
				//chro
				arraylist.add(x);
			}
		}
		Collections.sort(arraylist, Solution.Sor);
		Sim[] obj1=new Sim[arraylist.size()];
		obj1= arraylist.toArray(obj1);
		return obj1;
	}
	
	public static void main(String args[])
	{
		Sim obj[]=new Sim[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;++i)
		{
			obj[i]=new Sim();
			obj[i].setSimId(sc.nextInt());
			sc.nextLine();
			obj[i].setCustomerName(sc.nextLine());
			obj[i].setBalance(sc.nextDouble());
			obj[i].setRatePerSecond(sc.nextDouble());
			sc.nextLine();
			obj[i].setCircle(sc.nextLine());
		}
		
		String circle1= sc.nextLine();
		String circle2= sc.nextLine();
		sc.close();
		
		Sim obj1[]=transferCircle(obj, circle1, circle2);
		
		for(Sim x:obj1)
		{
			System.out.println(x.getSimId() + " "+ x.getCustomerName() +" " + x.getCircle()+" " + x.getRatePerSecond());
		}
		
	}

	public static Comparator<Sim> Sor = new Comparator<Sim>() {
		
		/*@Override
		public int compare(Sim o1, Sim o2) {
			// TODO Auto-generated method stub
			double rate1= o1.getRatePerSecond();
			double rate2= o2.getRatePerSecond();
			double r= Math.ceil(rate1-rate2);
			return (int)r;
		}*/
		
		@Override
	    public int compare(Sim o1, Sim o2) {
	        return Double.compare(o2.getRatePerSecond(), o1.getRatePerSecond()); // Note the order is reversed for descending
	    }
	};

	@Override
	public int compare(Sim o1, Sim o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
