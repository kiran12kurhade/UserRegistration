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

        scanner.close();
    }
        
    }
