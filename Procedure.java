package ssawai_project2;

/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: This class represents a medical procedure performed on a patient. 
 * It contains details such as the procedure name, date, practitioner, and charges.
 * Due: 02/27/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or 
 * any source. I have not given my code to any student.
 * Print your Name here: Sinsho Sawai
 */

import java.util.Scanner;

public class Procedure {
    //Declare private instance variables to store procedure details
    private String name;
    private String date;
    private String practitioner;
    private double charges;

    //Constructor that initializes name, date, practitioner, and charges
    public Procedure(String name, String date, String practitioner, double charges) {
        this.name = name; 
        this.date = date; 
        this.practitioner = practitioner; 
        this.charges = charges; 
    }

    //Getter method for procedure name
    public String getName() {
        return name; 
    }

    //Getter for procedure date
    public String getDate() {
        return date;
    }

    //Getter for the practitioner's name
    public String getPractitioner() {
        return practitioner; 
    }

    //Getter for charges
    public double getCharges() {
        return charges; 
    }

    //Setter for procedure name
    public void setName(String name) {
        this.name = name;
    }

    //Setter for procedure date
    public void setDate(String date) {
        this.date = date; 
    }

    //Setter for practitioner's name
    public void setPractitioner(String practitioner) {
        this.practitioner = practitioner; 
    }

    //Setter for charges
    public void setCharges(double charges) {
        this.charges = charges;  // Set the procedure charges
    }

    //toString method to return a string for the procedure details
    public String toString() {
        // Return a string with all procedure details: name, date, practitioner, and charges
        return "Procedure Name: " + name + "\nDate: " + date + "\nPractitioner: " + practitioner + "\nCharges: $" + charges;
    }
}
