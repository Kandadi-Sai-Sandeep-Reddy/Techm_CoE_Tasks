package Unique_Characters;

import java.util.*;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a string:");
        String s = sc.nextLine();
        sc.close();

        // Set to store unique characters
        Set<Character> uniqueChars = new LinkedHashSet<>();
        // Set to store duplicate characters
        Set<Character> duplicateChars = new HashSet<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!duplicateChars.contains(c)) {
                // If character is not a duplicate, try to add to uniqueChars
                if (!uniqueChars.add(c)) {
                    // If character is already in uniqueChars, move to duplicateChars
                    uniqueChars.remove(c);
                    duplicateChars.add(c);
                }
            }
        }

        // Print unique characters
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c);
        }
    }
}
