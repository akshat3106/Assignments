package assignment1;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer greater than 2: ");
        int number = scanner.nextInt();
        if (number <= 2) {
            System.out.println("Please enter a number greater than 2.");
        } else {
            int count = 0;
            while (number >= 2) {
                number /= 2;
                count++;
            }
            System.out.println("Number of divisions: " + (count-1));
        }
        scanner.close();
    }
}

