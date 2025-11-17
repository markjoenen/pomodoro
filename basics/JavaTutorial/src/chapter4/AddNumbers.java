package chapter4;

//Write a program that allows a user
//to enter two numbers, and then
//sums up the two numbers.
//The user should be able to repeat
//this action until they indicate they
//are done.

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);
        boolean again = true;
        do{
            System.out.print("Enter first number:");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is: " + sum);

            System.out.println("Do you want to compute again? y or n?");
            if(scanner.next().equalsIgnoreCase("n")){
                again = false;
            }
        } while (again);

        scanner.close();
    }
}
