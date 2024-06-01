package Nasal_Vessel;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NavalVessel[] vessels = new NavalVessel[4];

        for (int i = 0; i < 4; i++) {
            int vesselId = scanner.nextInt();
            scanner.nextLine(); 
            String vesselName = scanner.nextLine();
            int noOfVoyagesPlanned = scanner.nextInt();
            int noOfVoyagesCompleted = scanner.nextInt();
            scanner.nextLine(); 
            String purpose = scanner.nextLine();

            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        int percentage = scanner.nextInt();
        scanner.nextLine(); 
        String purpose = scanner.nextLine();
        scanner.close();

        double avgVoyages = findAvgVoyagesByPct(vessels, percentage);
        System.out.println(avgVoyages);

        NavalVessel vessel = findVesselByGrade(vessels, purpose);
        if (vessel != null) {
            System.out.println( vessel.getVesselName() + "%" + vessel.getClassification());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }

    public static double findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        int sum = 0;
        int count = 0;

        for (NavalVessel vessel : vessels) {
            if (vessel.getNoOfVoyagesPlanned() > 0) {
                int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                if (pct >= percentage) {
                    sum += vessel.getNoOfVoyagesCompleted();
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
    }

    public static NavalVessel findVesselByGrade(NavalVessel[] vessels, String purpose) {
        for (NavalVessel vessel : vessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
                int pct = 0;
                if (vessel.getNoOfVoyagesPlanned() > 0) {
                    pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                }

                if (pct == 100) {
                    vessel.setClassification("Star");
                } else if (pct >= 80) {
                    vessel.setClassification("Leader");
                } else if (pct >= 55) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }

                return vessel;
            }
        }

        return null;
    }
}