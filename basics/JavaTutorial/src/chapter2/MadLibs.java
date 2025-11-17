package chapter2;

import java.util.Scanner;

public class MadLibs {
    public  static void main(String arg[]){
        System.out.println("What is your favourite season?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        System.out.println("What's your favourite whole number?");
        int wholeNum = scanner.nextInt();
        System.out.println("What's your favourite adjective?");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " +  season + " day, I drink a minimum of " + wholeNum + " cups of coffee.");
    }
}