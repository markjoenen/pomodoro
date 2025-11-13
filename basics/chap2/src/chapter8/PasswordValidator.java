package chapter8;

//Validate the complexity of a proposed password by assuring it meets
//these rules:
//•at least 8 characters long
//•contain an uppercase letter
//•contain a special character
//•not contain the username
//•not the same as the old password

import java.util.Scanner;

public class PasswordValidator {
    private String username;
    private String currentPassword;
    private boolean valid;
    private String errMessage;

    private static final int PASSWORD_LENGTH = 8;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var validator = PasswordValidator.login();
        System.out.println("avacado".split("a").length);
        do {
            System.out.print("Please input new password: ");
            if (!validator.changePassword(scanner.next())){
                System.out.println(validator.errMessage);
            }

        } while (!validator.isValid());

        System.out.println("Password is valid!");
        scanner.close();
    }

    public PasswordValidator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
        this.valid = false;
    }

    public boolean isValid(){
        return valid;
    }

    public boolean changePassword(String newPassword){
        if (newPassword.length() < PASSWORD_LENGTH){
            errMessage = "Password is less than " + Integer.toString(PASSWORD_LENGTH) + ".";
            return false;
        }
        else if (!hasUpperCase(newPassword)){
            errMessage = "Password does not have an uppercase.";
            return false;
        }
        else if (newPassword.matches("[a-zA-Z0-9 ]*")) {
            errMessage = "Password does not have a special character.";
            return false;
        }
        else if (newPassword.contains(this.username)){
            errMessage = "Password must not contain the username.";
            return false;
        }
        else if (newPassword.equals(this.currentPassword)){
            errMessage = "Please input a new password.";
            return false;
        }
        else {
            this.valid = true;
            return true;
        }
    }

    public boolean hasUpperCase(String text){
        for (char s : text.toCharArray()){
            if (Character.isUpperCase(s)){
               return true;
            }
        }
        return false;
    }

    public static PasswordValidator login(){
        System.out.print("Please enter your username: ");
        String username = scanner.next();

        System.out.print("Please enter your password: ");
        String currentPassword = scanner.next();

        return new PasswordValidator(username, currentPassword);
    }

}
