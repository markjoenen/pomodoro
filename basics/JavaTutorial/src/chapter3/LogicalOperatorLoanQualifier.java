package chapter3;

import java.util.Scanner;

/*
To qualify for a loan, a person
must make at least $30,000 and
have been working at their
current job for at least 2 years.
* */
public class LogicalOperatorLoanQualifier {
    public static void main(String args[]) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Provide your salary.");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How long are you working with your current employer?");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats, you qualify for a loan.");
        }
        else{
            System.out.println("Sorry, you must atleast earn " + requiredSalary);
        }

    }
}
