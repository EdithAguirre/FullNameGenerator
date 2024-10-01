package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        //Create scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName =  scanner.nextLine();
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        // Display full name
        String fullName = firstName.trim();

        // if middle name isn't empty add to full name
        if(middleName != ""){
            fullName += " " + middleName.trim();
        }
        // add last name to full name
        fullName += " " + lastName.trim();

        // if suffix isn't empty add to full name
        if(suffix.length() >= 1) {
            fullName += ", " + suffix.trim();
        }

        // Display full name
        System.out.print("Full name: " + fullName);
    }
}
