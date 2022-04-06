package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<PersonDetails> contact = new ArrayList<>();
     Scanner input = new Scanner(System.in);

    public void userChoice() {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (i <= count) {
            System.out.println("Select the Option");
            System.out.println("1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Display Contact");
            int value = sc.nextInt();
            switch (value) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    displayContact();
                    break;
            }
        }
    }
        public void addContact () {
            System.out.println("Enter the Contact Details: ");
            System.out.println("Enter the First Name: ");
            String firstName = input.nextLine();
            System.out.println("Enter the Last Name: ");
            String lastName = input.nextLine();
            System.out.println("Enter the Address : ");
            String address = input.nextLine();
            System.out.println("Enter the City : ");
            String city = input.nextLine();
            System.out.println("Enter the State: ");
            String state = input.nextLine();
            System.out.println("Enter the Zip Code: ");
            long zipCode = input.nextLong();
            System.out.println("Enter Your Mobile Number: ");
            long mobileNumber = input.nextLong();
            System.out.println("Enter Your e-Mail ID : ");
            String eMail = input.nextLine();


            contact.add(new PersonDetails(firstName, lastName, address, city, state, mobileNumber, eMail, zipCode));
            System.out.println(firstName + " Added your Details into Contact, Thanks For Using!");
            return;
        }

        public void editContact () {
            PersonDetails presentContact = null;
            System.out.println("Enter the FirstName Of the Contact to Edit");
            String firstName = input.nextLine();
            System.out.println("Enter the LastName Of the Contact to Edit");
            String lastName = input.nextLine();
            for (PersonDetails person : contact) {
                if (person.getFirstName().equalsIgnoreCase(firstName) && person.getLastName().equalsIgnoreCase(lastName)) {
                    presentContact = person;
                }
            }
            System.out.println("Select Option\n1.First Name\n2.Last Name\n3.City\n4.State\n5.zip\n6.Mobile Number\n7.eMail\n8.Address");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the First Name");
                    String newName = input.nextLine();
                    presentContact.setFirstName(newName);
                    break;
                case 2:
                    System.out.println("Enter the Last Name");
                    String newLastName = input.nextLine();
                    presentContact.setLastName(newLastName);
                    break;
                case 3:
                    System.out.println("Enter the New City ");
                    String newCityName = input.nextLine();
                    presentContact.setCity(newCityName);
                    break;
                case 4:
                    System.out.println("Enter the New State");
                    String newState = input.nextLine();
                    presentContact.setCity(newState);
                    break;
                case 5:
                    System.out.println("Enter the New ZipCode");
                    long newZipCode = input.nextLong();
                    presentContact.setZip(newZipCode);
                    break;
                case 6:
                    System.out.println("Enter the New Mobile Number");
                    long newMobileNumber = input.nextLong();
                    presentContact.setPhone(newMobileNumber);
                    break;
                case 7:
                    System.out.println("Enter the New E-Mail ID");
                    String newE_Mail = input.nextLine();
                    presentContact.setEmail(newE_Mail);
                    break;
                case 8:
                    System.out.println("Enter the New Address");
                    String newAddress = input.nextLine();
                    presentContact.setStreet(newAddress);
                    break;
            }

        }


        public void deleteContact () {
            System.out.println("Enter the First Name of the Contact to Delete");
            String firstName = input.nextLine();
            System.out.println("Enter the Last Name of the Contact to Delete");
            String lastName = input.nextLine();
            for (PersonDetails person : contact) {
                if (person.getFirstName().equalsIgnoreCase(firstName) && person.getLastName().equalsIgnoreCase(lastName)) {
                    contact.remove(person);
                }
            }
        }

        public void displayContact () {
            System.out.println(contact);
        }


    }
