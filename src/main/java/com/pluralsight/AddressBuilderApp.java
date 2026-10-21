package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {


    //!creating a main method
    public static void main(String[] args) {

        //! Creating a Scanner
        Scanner addressBuilder = new Scanner(System.in);

        //*Asking for full name
        System.out.println(questions("What is your full name: "));

        //*Storing the full name
        String fullName = addressBuilder.nextLine();

        //?Calling the billing info
        billingQuestions(addressBuilder);

        //?Calling the shipping info
        shippingQuestion(addressBuilder);

       //!Creating a String builder
       StringBuilder billingInfo = new StringBuilder();

        System.out.println(billingInfo.toString());









    }


    //!creating methods asking the questions
    public static String questions(String customMessage){
        return customMessage;
    }

    //!asking for the billing info
    public static String billingQuestions(Scanner addressBuilder){

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

        //*Storing billing Zip
        String billingZip = addressBuilder.nextLine();

        //!Creating a String builder
        StringBuilder billingInfo = new StringBuilder();

        //* Appending the messages for billing info
        billingInfo.append("""
                Billing Address:"
                """);
        billingInfo.append(billingStreet);
        
        System.out.println(billingInfo.toString());




     return addressBuilder.nextLine();
    }

    //!asking for shipping info
    public static  String shippingQuestion(Scanner addressBuilder){

        //* Asking for shipping street
        System.out.println(questions("What is your shipping street: "));

        //*Storing the shipping Street
        String shippingStreet = addressBuilder.nextLine();

        //*Asking for the shipping city
        System.out.println(questions("What is your shipping city: "));

        //*Storing the shipping city
        String shippingCity = addressBuilder.nextLine();

        //*Asking the shipping state
        System.out.println(questions("What is your shipping state: "));

        //*Storing the shipping state
        String shippingState = addressBuilder.nextLine();

        //*Asking shipping Zip
        System.out.println(questions("What is your shipping zip: "));

        //*Storing shipping Zip
        String shippingZip = addressBuilder.nextLine();

        return addressBuilder.nextLine();
    }
}
