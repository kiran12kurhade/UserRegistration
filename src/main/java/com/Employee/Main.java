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
    public static boolean isValidMobileNumber(String mobileNumber) {
        // Regular expression to validate the mobile number format "91 9919819801"
        String mobileRegex = "^91\\s[0-9]{10}$";
        return mobileNumber.matches(mobileRegex);
    }
    // Rule1: Password should be a minimum of 8 characters
    // Rule2: Password should have at least 1 uppercase letter
    public static boolean isValidPassword(String password) {
        // Check if password length is at least 8
        if (password.length() < 8) {
            return false;
        }

        // Check if password contains at least one uppercase letter
        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }

        return hasUpperCase;
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


        System.out.println("Enter a valid mobile number (format: 91 9919819801):");
        String mobileNumber = scanner.nextLine();

        if (isValidMobileNumber(mobileNumber)) {
            System.out.println("Mobile number is valid.");
        } else {
            System.out.println("Mobile number is invalid. It should follow the format: 91 9919819801.");
        }

        System.out.println("Enter a password (minimum 8 characters, at least 1 uppercase letter):");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. It should be at least 8 characters long and contain at least 1 uppercase letter.");
        }
        scanner.close();
    }
        
    }
