package Unique_Characters;

import java.util.*;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a string:");
        String s = sc.nextLine();
        sc.close();

        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!duplicateChars.contains(c)) {
                
                if (!uniqueChars.add(c)) {
                    duplicateChars.add(c);
                }
            }
        }

        //System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c);
        }
    }
}
