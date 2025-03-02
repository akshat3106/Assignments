package assignment1;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is "+ bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Category: Normal Weight");
        } else if (bmi <= 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        scanner.close();
    }
}

