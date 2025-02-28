package ssawai_project2;

/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: This class serves as the driver (main) class for managing patient information and medical procedures. 
 * It collects patient details from user input, creates Patient and Procedure objects, and displays relevant information, 
 * including total procedure costs.
 * Due: 02/27/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or 
 * any source. I have not given my code to any student.
 * Print your Name here: Sinsho Sawai
 */

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        // Create a Scanner object to collect user input
        Scanner scanner = new Scanner(System.in);

        // Collect personal details of the patient from the user
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter street address: ");
        String streetAddress = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state: ");
        String state = scanner.nextLine();
        System.out.print("Enter ZIP code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter emergency contact name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.print("Enter emergency contact phone: ");
        String emergencyContactPhone = scanner.nextLine();
        
        // Collect details for the procedures
        System.out.println("\nEnter details for Procedure 1:");
        System.out.print("Enter procedure name: ");
        String p1Name = scanner.nextLine();
        System.out.print("Enter procedure date: ");
        String p1Date = scanner.nextLine();
        System.out.print("Enter practitioner's name: ");
        String p1Practitioner = scanner.nextLine();
        System.out.print("Enter procedure charges: ");
        double p1Charges = scanner.nextDouble();
        scanner.nextLine();  // Consume the remaining newline

        System.out.println("\nEnter details for Procedure 2:");
        System.out.print("Enter procedure name: ");
        String p2Name = scanner.nextLine();
        System.out.print("Enter procedure date: ");
        String p2Date = scanner.nextLine();
        System.out.print("Enter practitioner's name: ");
        String p2Practitioner = scanner.nextLine();
        System.out.print("Enter procedure charges: ");
        double p2Charges = scanner.nextDouble();
        scanner.nextLine();  // Consume the remaining newline

        System.out.println("\nEnter details for Procedure 3:");
        System.out.print("Enter procedure name: ");
        String p3Name = scanner.nextLine();
        System.out.print("Enter procedure date: ");
        String p3Date = scanner.nextLine();
        System.out.print("Enter practitioner's name: ");
        String p3Practitioner = scanner.nextLine();
        System.out.print("Enter procedure charges: ");
        double p3Charges = scanner.nextDouble();
        scanner.nextLine();  // Consume the remaining newline

        // Create a Patient object using the provided details
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, 
                city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone);

        // Display the patient's information
        System.out.println("\nPatient info:");
        displayPatient(patient);

        // Create Procedure objects based on the user input
        Procedure procedure1 = new Procedure(p1Name, p1Date, p1Practitioner, p1Charges);
        Procedure procedure2 = new Procedure(p2Name, p2Date, p2Practitioner, p2Charges);
        Procedure procedure3 = new Procedure(p3Name, p3Date, p3Practitioner, p3Charges);

        // Display details for each procedure
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display the total charges for all procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charges: $%.2f\n", totalCharges);

        // Display student information
        System.out.println("\nStudent Name: " + patient.buildFullName());
        System.out.println("MC#: 21210846");
        System.out.println("Due Date: 02/27/2025");

        // Close the scanner object
        scanner.close();
    }

    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println(" Name: " + patient.buildFullName());
        System.out.println(" Address: " + patient.buildAddress());
        System.out.println(" Emergency Contact: " + patient.buildEmergencyContact());
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println("\n    Procedure: " + procedure.getName());
        System.out.println("    Procedure Date: " + procedure.getDate());
        System.out.println("    Practitioner: " + procedure.getPractitioner());
        System.out.println("    Charge: $" + procedure.getCharges());
    }

    // Method to calculate the total charges for three procedures
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}
