package com.Employee;

import java.util.Scanner;

public class Main {
    public static boolean isValidFirstName(String firstName) {
        // Regular expression to check if the first name starts with a capital letter and has at least 3 characters
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static boolean isValidLastName(String lastName) {
        // Regular expression to check if the last name starts with a capital letter and has at least 3 characters
        return lastName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static boolean isValidEmail(String email) {
        // Regular expression to validate the email format
        String emailRegex = "^[a-zA-Z0-9]{3,}(\\.[a-zA-Z0-9]{3,})?@[a-zA-Z0-9]{2,}\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2})?$";
        return email.matches(emailRegex);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a valid first name:");
        String firstName = scanner.nextLine();

        if (isValidFirstName(firstName)) {
            System.out.println("First name is valid.");
        } else {
            System.out.println("First name is invalid. It should start with a capital letter and have at least 3 characters.");
        }

        System.out.println("Enter a valid last name:");
        String lastName = scanner.nextLine();

        if (isValidLastName(lastName)) {
            System.out.println("Last name is valid.");
        } else {
            System.out.println("Last name is invalid. It should start with a capital letter and have at least 3 characters.");
        }

        System.out.println("Enter a valid email:");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid. Ensure it follows the format: abc.xyz@bl.co.in");
        }


        scanner.close();
    }
        
    }
