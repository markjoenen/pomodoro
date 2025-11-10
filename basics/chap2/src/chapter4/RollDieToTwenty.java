package chapter4;

//The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
//Roll the die for the user (generate a Random number between 1 - 6) and advance the user
//•
//that number of spaces on the game board. [Code for this is in Independent Exercise section]
//After each roll, tell the user which game space they are on and how many more spaces they
//have to go to win.
//        Repeat this 4 additional times for 5 rolls in total.
//        However, if the user gets to 20 before 5 rolls, end the game - they've won.
//        •
//        • If they are greater than or less than 20 spaces exactly, they lose.
//Remember there are only 20 spaces on the board, so a message like "You advanced to space
//        •
//        22" is a bug.

import java.util.Random;
import java.util.Scanner;

public class RollDieToTwenty {
    public static void main(String args[]) {
        int boardSpace = 20;
        int dieRollLimit = 5;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Die Game, you roll a dice for 5 times and win if you land exactly to 20.");
        do{
            System.out.print("Are you ready? [y or n] ");
        } while (scanner.next().equalsIgnoreCase("n"));

        int currentSpace = 1;
        for (int i = 0; i < dieRollLimit; i++){
            int randomDieNumber = random.nextInt(6) + 1;

            System.out.print("You are currently at " + currentSpace + "th space. Continue? [y or n] ");
            if (scanner.next().equalsIgnoreCase("n")){
                System.out.println("Better luck next time!");
                break;
            }
            currentSpace = currentSpace + randomDieNumber;
//            currentSpace = 22;

            if (currentSpace == boardSpace){
                System.out.println("Congrats! You win! You are exactly at the " + currentSpace + "th space.");
                break;
            } else if (currentSpace > boardSpace){
                System.out.println("Oof. You're at " + i + " roll but already at the " + currentSpace + "th space. Way beyond the limit. You loose. Maybe next time?");
                break;
            }
        }

        if(currentSpace < boardSpace){
            System.out.println("Oof. You already exhausted your rolls but you're siting at " + currentSpace + "th space. Maybe next time.");
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
