package chapter3;

import java.util.Scanner;

/*
If Statement practice
All sales people get a payment of $1000 a week.
Sales people who exceed 10 sales get an additional bonus of $250.
*/
public class SalaryCalculated {
    public static void main(String arg[]) {
         int fixedSalary = 1000;
         int bonus = 250;
         int qouta = 10;

         // ask for the sales made by employee
        System.out.println("How many sales did you make?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > qouta) {
            fixedSalary = fixedSalary + bonus;
        }

        System.out.println("The total salary you made is: $" + fixedSalary);
    }
}
