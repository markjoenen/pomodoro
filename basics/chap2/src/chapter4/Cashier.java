package chapter4;

//Write a cashier program that will
//scan a given number of items and
//tally the cost.

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]) {
        System.out.print("Enter item count:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for(int i = 0; i < quantity; i++){
            System.out.print("Cost of item:");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("You total cost is: $" + total);
    }
}
