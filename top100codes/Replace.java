package top100codes;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        one();
        
    }

    public static void one() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number to replace all 0 with 1:");
        int num = sc.nextInt();
        sc.close(); // Close the scanner to avoid resource leaks

        // If the number is 0, directly return "1"
        if (num == 0) {
            System.out.println(1);
            return;
        }

        // Process the number digit by digit
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                rem = 1; // Replace 0 with 1
            }
            result.insert(0, rem); // Insert digits in the correct order
            num /= 10;
        }

        System.out.println("Result: " + result);
    }
}
