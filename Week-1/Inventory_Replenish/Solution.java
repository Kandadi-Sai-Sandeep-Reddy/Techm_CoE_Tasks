package Inventory_Replenish;

import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory[] inventories = new Inventory[4];

        for (int i = 0; i < 4; i++) {
            String inventoryId = scanner.nextLine();
            int maximumQuantity = scanner.nextInt();
            int currentQuantity = scanner.nextInt();
            int threshold = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            inventories[i] = new Inventory();
            inventories[i].setCurrentQuantity(currentQuantity);
            inventories[i].setInventoryId(inventoryId);
            inventories[i].setMaximumQuantity(maximumQuantity);
            inventories[i].setThreshold(threshold);
        }

        int limit = scanner.nextInt();
        scanner.close();

        Inventory[] replenishedInventories = replenish(inventories, limit);

        for (Inventory inventory : replenishedInventories) {
            int threshold = inventory.getThreshold();
            if (threshold > 75) {
                System.out.println(inventory.getInventoryId() + " Critical Filling");
            } else if (threshold >= 50 && threshold <= 75) {
                System.out.println(inventory.getInventoryId() + " Moderate Filling");
            } else {
                System.out.println(inventory.getInventoryId() + " Non-Critical Filling");
            }
        }
    }

    public static Inventory[] replenish(Inventory[] inventories, int limit) {
        ArrayList<Inventory> result = new ArrayList<>();

        for (Inventory inventory : inventories) {
            if (limit <=inventory.getThreshold() ) {
                result.add(inventory);
            }
        }

        return result.toArray(new Inventory[0]);
    }
}

