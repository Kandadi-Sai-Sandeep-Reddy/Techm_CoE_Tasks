package Character_At_Odd_Pos;

import java.util.Scanner;

public class CharOddPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String input = scanner.nextLine();
        
        // Print characters at odd positions
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(input.charAt(i));
            }
        }
        
        scanner.close();
    }
}

