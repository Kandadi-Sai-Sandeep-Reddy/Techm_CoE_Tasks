package Travel_Agencies;

import java.util.Scanner;

public class Solution {

		public static int findAgencyWithHighestPackagePrice(TravelAgencies[] obj)
		{
			int highestPackagePrice=0;
			for(int i=0;i<4;++i)
			{
				if (obj[i].getPrice() >= highestPackagePrice)
				{
					highestPackagePrice= obj[i].getPrice();
				}
			}
			return highestPackagePrice;
		}
		
		public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] obj, int regNo, String packageType)
		{
			for(TravelAgencies x: obj)
			{
				String y= x.getPackageType();
				if(x.getRegNo()==regNo && y.equals(packageType) && x.getFlightFacility()==true)
				{
					return x;
				}
			}
			return null;
		}
		
		public static void  main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			TravelAgencies obj[]= new TravelAgencies[4];
			
			for(int i=0;i<4;++i)
			{
				obj[i]=new TravelAgencies();
				obj[i].setRegNo(sc.nextInt());
				sc.nextLine();
				obj[i].setAgencyName(sc.nextLine());
				obj[i].setPackageType(sc.nextLine());
				obj[i].setPrice(sc.nextInt());
				obj[i].setFlightFacility(sc.nextBoolean());
			}
			int regNo=sc.nextInt();
			sc.nextLine();
			String packageType=sc.nextLine();
			sc.close();
			
			int highestPackagePrice= findAgencyWithHighestPackagePrice(obj);
			TravelAgencies obj1= agencyDetailsForGivenldAndType(obj, regNo,packageType);
					
			System.out.println(highestPackagePrice);
			System.out.println(obj1.getAgencyName() +" : " + obj1.getPrice());
		
	}

}
