package chapter3;


import java.util.Scanner;

public class QoutaCalculator {
    public static void main(String arg[]) {
        int qouta = 10;

        System.out.println("How many sales you made this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= qouta){
            System.out.println("Congrats! You met your qouta.");
        }
        else{
            int salesShort = qouta - sales;
            System.out.println("You are short by " + salesShort);
        }
    }
}
