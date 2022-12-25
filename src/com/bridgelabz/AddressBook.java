package com.bridgelabz;
import java.util.Scanner;

public class AddressBook {
    //Scanner object for User Input
    Scanner sc = new Scanner(System.in);

    //Created Contacts Object for Getter and Setter Methods
    Contacts contacts = new Contacts();

    //Method to Add New Contact to AddressBook
    public void addNewContact() {
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        contacts.setFirstname(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the PIN Code :");
        contacts.setPin(sc.nextLong());
        System.out.println("Enter the Phone Number :");
        contacts.setPhonenumber(sc.nextLong());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
    }

    //Method to Show the Contact Details
    public void displayContact() {
        System.out.println("--------------------------------------------");
        System.out.println("Contact Details :-");
        System.out.println("Name : "+contacts.getFirstname()+" "+contacts.getLastname());
        System.out.println("Address : "+contacts.getAddress());
        System.out.println("City : "+contacts.getCity());
        System.out.println("State : "+contacts.getState());
        System.out.println("PIN Code : "+contacts.getPin());
        System.out.println("Phone Number : "+contacts.getPhonenumber());
        System.out.println("EMail ID : "+contacts.getEmail());
        System.out.println("---------------------------------------------");
    }
}