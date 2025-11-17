package chapter3;
//Display a letter grade for a
//student based on their test score.

import java.util.Scanner;

public class TestResult {
    public static void main(String args[]) {
        System.out.println("Please enter your grade score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();
        char grade;

        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
