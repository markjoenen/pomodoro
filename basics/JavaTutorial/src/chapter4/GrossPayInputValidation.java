package chapter4;

//Each store employee makes $15 an
//hour. Write a program that allows a
//manager to enter the number of
//weekly hours worked for each
//employee, and calculate their pay.
//Do not allow for overtime.

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String arg[]) {
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours you worked this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must not exceed 40hours.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
