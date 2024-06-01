package Medicine_Get_Price_By_Disease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Medicine[] medicines = new Medicine[4];

        for (int i = 0; i < 4; i++) {
            String medicineName = scanner.nextLine();
            String batch = scanner.nextLine();
            String disease = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            medicines[i] = new Medicine();
            medicines[i].setMedicineName(medicineName);
            medicines[i].setBatch(batch);
            medicines[i].setDisease(disease);
            medicines[i].setPrice(price);
        }

        String disease = scanner.nextLine();
        scanner.close();

        Integer[] prices = getPriceByDisease(medicines, disease);

        for (int price : prices) {
            System.out.println(price);
        }
    }

    public static Integer[] getPriceByDisease(Medicine[] medicines, String disease) {
        List<Integer> prices = new ArrayList<>();

        for (Medicine medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease)) {
                prices.add(medicine.getPrice());
            }
        }

        Collections.sort(prices);
        
        return prices.toArray(new Integer[0]);
    }
}

