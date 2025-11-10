package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        System.out.print("Enter worked hours:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.print("Enter worker rate:");
        double rate = scanner.nextDouble();
        scanner.close();

        double grossPay = hours * rate;

        System.out.print("Worker gross pay is " + grossPay);
    }
}
