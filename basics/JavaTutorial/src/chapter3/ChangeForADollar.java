package chapter3;

//The objective of the game is to enter enough change to equal exactly $1! Create
//a program that asks a user to enter the quantities for the following coins:
//pennies, nickels, dimes, and quarters. Your program should count up the value of
//all the change. If it's exactly $1, they win! If it's more than $1, tell them by how
//much they went over. If it's less than $1, tell them by how much they went under.
//Feel free to change the game for your country's currency!

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String args[]) {
        double pennyMultiplier = 0.01;
        double nickelMultiplier = 0.05;
        double dimeMultiplier = 0.10;
        double quarterMultiplier = 0.25;

        System.out.print("This is a Dollar game! Please enter how many pennies:");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextInt()*pennyMultiplier;
        System.out.print("Enter how many nickels:");
        double nickels = scanner.nextInt()*nickelMultiplier;
        System.out.print("Enter how many dimes:");
        double dimes = scanner.nextInt()*dimeMultiplier;
        System.out.print("Enter how many quarters:");
        double quarter = scanner.nextInt()*quarterMultiplier;
        scanner.close();

        double total = pennies + nickels + dimes + quarter;
        if(total < 1) {
            double shortTotal = 1 - total;
            System.out.print("So close! Your total amount is: $" + total + ". You're short by $" + shortTotal);
        }
        else if(total > 1){
            double exceedTotal = total - 1;
            System.out.print("So close! Your total amount is: $" + total + ". Your guess exceed by $" + exceedTotal);
        }
        else {
            System.out.print("Right on money! Your total is " + total + " dollars.");
        }
    }
}
