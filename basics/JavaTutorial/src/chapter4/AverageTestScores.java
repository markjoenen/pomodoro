package chapter4;

//Find the average test scores for
//each student in the class. There are
//24 students and 4 tests.

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 24;
        int numberOfTests = 4;

        for(int i = 0; i < numberOfStudents; i++){
            double total = 0;
            for(int j = 0; j < numberOfTests; j++){
                System.out.print("Enter the score of Test #" + (j+1) + ": ");
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i + 1) + " is " + average);
        }
        scanner.close();
    }
}
