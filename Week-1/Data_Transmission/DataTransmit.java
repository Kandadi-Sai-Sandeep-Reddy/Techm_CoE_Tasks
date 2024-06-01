package Data_Transmission;

import java.util.*;

public class DataTransmit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        
        int totalPrimes = 0;
        int largestPrime = Integer.MIN_VALUE;
        int secondLargestPrime = Integer.MIN_VALUE;
        
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (isPrime(num)) {
                totalPrimes++;
                if (num > largestPrime) {
                    secondLargestPrime = largestPrime;
                    largestPrime = num;
                } else if (num > secondLargestPrime) {
                    secondLargestPrime = num;
                }
            }
        }
        
        int result = totalPrimes + secondLargestPrime;
        System.out.println(result);
        
        scanner.close();
    }
    

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
