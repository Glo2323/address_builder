package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {


    //!creating a main method
    public static void main(String[] args) {

        //! Creating a Scanner
        Scanner addressBuilder = new Scanner(System.in);


        billingQuestions(addressBuilder);









    }


    //!creating methods asking the questions
    public static String questions(String customMessage){
        return customMessage;
    }

    public static String billingQuestions(Scanner addressBuilder){

        //*Asking for full name
        System.out.println(questions("What is your full name: "));

        //*Storing the full name
        String fullName = addressBuilder.nextLine();

        //* Asking for billing street
        System.out.println(questions("What is your billing street: "));

        //*Storing the billing Street
        String billingStreet = addressBuilder.nextLine();

        //*Asking for the billing city
        System.out.println(questions("What is your billing city: "));

        //*Storing the billing city
        String billingCity = addressBuilder.nextLine();

        //*Asking the billing state
        System.out.println(questions("What is your billing state: "));

        //*Storing the billing state
        String billingState = addressBuilder.nextLine();

        //*Asking billing Zip
        System.out.println(questions("What is your billing zip: "));

        //*Storing Zip
        String billingZip = addressBuilder.nextLine();

     return addressBuilder.nextLine();
    }
}
