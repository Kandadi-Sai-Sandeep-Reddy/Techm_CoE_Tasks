package Institution;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Institution[] institutions = new Institution[4];

        for (int i = 0; i < 4; i++) {
            int institutionId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String institutionName = scanner.nextLine();
            int noOfStudentsPlaced = scanner.nextInt();
            int noOfStudentsCleared = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String location = scanner.nextLine();

            institutions[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }

        String location = scanner.nextLine();
        String institutionName = scanner.nextLine();

        int numCleared = findNumClearancedByLoc(institutions, location);
        if (numCleared > 0) {
            System.out.println(numCleared);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution institution = updateInstitutionGrade(institutions, institutionName);
        if (institution != null) {
            System.out.println(institution.getInstitutionName() + "::" + institution.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }

        scanner.close();
    }

    public static int findNumClearancedByLoc(Institution[] institutions, String location) {
        int sum = 0;

        for (Institution institution : institutions) {
            if (institution.getLocation().equalsIgnoreCase(location)) {
                sum += institution.getNoOfStudentsCleared();
            }
        }

        return sum;
    }

    public static Institution updateInstitutionGrade(Institution[] institutions, String institutionName) {
        for (Institution institution : institutions) {
            if (institution.getInstitutionName().equalsIgnoreCase(institutionName)) {
                int rating = (institution.getNoOfStudentsPlaced() * 100) / institution.getNoOfStudentsCleared();
                if (rating >= 80) {
                    institution.setGrade("A");
                } else {
                    institution.setGrade("B");
                }
                return institution;
            }
        }

        return null;
    }
}

