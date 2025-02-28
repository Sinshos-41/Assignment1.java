package ssawai_project2;
/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: This class represents a patient in a medical system. 
 * It stores personal details such as name, address, phone number, and emergency contact information.
 * Due: 02/27/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or 
 * any source. I have not given my code to any student.
 * Print your Name here: Sinsho Sawai
 */
import java.util.Scanner;

public class Patient {
    //Private instance variables to store patient information
    private String firstName, middleName, lastName;
    private String streetAddress, city, state, zipCode;
    private String phoneNumber;
    private String emergencyContactName, emergencyContactPhone;
    
    /*Constructor to initialize a Patient object with personal details. This constructor
     * initializes the firstName, middleName, lastName, address, city, state, zip code, phone number, 
     * and emergency contact information. 
     */
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, 
    		String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;  
        this.middleName = middleName;  
        this.lastName = lastName; 
        this.streetAddress = streetAddress; 
        this.city = city;
        this.state = state; 
        this.zipCode = zipCode; 
        this.phoneNumber = phoneNumber;  
        this.emergencyContactName = emergencyContactName; 
        this.emergencyContactPhone = emergencyContactPhone; 
    }
    
    //Method to build and return the full name of the patient with a space in between each name.
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;  
    }
    
    //Method to build and return the full address of the patient with a space in between the address,
    //city, state and zip code.
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode; 
    }
    
    //Method to build and return the emergency contact information with a space in between the name and the emergency phone
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;  
    }
    
    //Display patient info in a formatted way
    public String toString() {
        return "Patient Info: " + buildFullName() + "\nAddress: " + buildAddress() + 
               "\nPhone: " + phoneNumber + "\nEmergency Contact: " + buildEmergencyContact();
    }
}
