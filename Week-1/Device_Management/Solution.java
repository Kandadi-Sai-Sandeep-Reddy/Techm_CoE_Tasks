package Device_Management;

import java.util.Scanner;



public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Phone[] phones = new Phone[4];

        for (int i = 0; i < 4; i++) {
            int phoneId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String os = scanner.nextLine();
            String brand = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            phones[i] = new Phone(phoneId, os, brand, price);
        }

        String brand = scanner.nextLine();
        String os = scanner.nextLine();

        int priceSum = findPriceForGivenBrand(phones, brand);
        if (priceSum > 0) {
            System.out.println(priceSum);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone phone = getPhoneIdBasedOnOs(phones, os);
        if (phone != null) {
            System.out.println(phone.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }

        scanner.close();
    }

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int sum = 0;

        for (Phone phone : phones) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                sum += phone.getPrice();
            }
        }

        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone : phones) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }

        return null;
    }
}

