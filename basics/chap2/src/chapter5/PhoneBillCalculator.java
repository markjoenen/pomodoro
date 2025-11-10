package chapter5;

//Calculate the final total of someone's cell phone bill.
//Allow the operator to input the plan fee and the number of overage minutes.
//Charge the user 0.25 for every minute they were over their plan, and 15% tax on
//the subtotal.
//Create separate methods to calculate the tax, overage fees, and final total.
//Print the itemized bill.
//Phone Bill Statement
//Plan: $82.45
//Overage: $2.25
//Tax: $12.71
//Total: $97.41

import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);
    static double overageFee = 0.25;
    static double taxFee = 0.15;

    public static void main(String args[]) {
        System.out.print("Enter base cost of the plan: ");
        double baseCostOfPlan = scanner.nextDouble();
        System.out.print("Overage minutes: ");
        int overageMinutes = scanner.nextInt();
        scanner.close();

        double overage = calculateOverageFees(overageMinutes);
        double tax = calculateTax(baseCostOfPlan, overage);
        double gross = calculateTotal(baseCostOfPlan, overage, tax);

        printTotal(baseCostOfPlan, overage, tax,gross);
    }

    public static double calculateOverageFees(int overageMinutes){
        return overageMinutes * overageFee;
    }

    public static double calculateTax(double baseCostOfPlan, double overage){
        return (baseCostOfPlan + overage) * taxFee;
    }

    public static double calculateTotal(double baseCostOfPlan, double overage, double tax){
        return baseCostOfPlan + overage + tax;
    }

    public static void printTotal(double baseCostOfPlan, double overage, double tax, double gross){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCostOfPlan);
        System.out.println("Overage: $" + overage);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + gross);
    }
}
