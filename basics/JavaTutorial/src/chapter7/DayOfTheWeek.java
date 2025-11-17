package chapter7;

//Make an array that holds the textual values of the days of the week
//Have the user input a number corresponding to the day of the week.
//Assume the week starts on Monday.
//Your program should output the String that represents the day of the
//week
//Example: User inputs the number 1, your program should print
//"Monday"

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String[] WEEK_NAME = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number (1-7): ");
        int num = scanner.nextInt();
        scanner.close();

        if(num >= 1 && num <= 7){
            System.out.print("Your weekday is: " + WEEK_NAME[num - 1]);
        }
        else {
            System.out.print("Please select only 1-7 number.");
        }
    }
}
