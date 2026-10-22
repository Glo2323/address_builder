package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    //! Creating a Scanner
    static Scanner addressBuilder = new Scanner(System.in);

    //!creating a main method
    public static void main(String[] args) {

        //?Intro
        System.out.println("Please Provide The Following Information");

        //*Asking for full name
        System.out.println(questions("What is your full name: "));

        //*Storing the full name
        String fullName = addressBuilder.nextLine();

        //?Calling the billing and shipping info
        String billingInfo = billingQuestion();

        String shippingInfo = shippingQuestion();

        //?Printing out customer info
        System.out.printf("""
                
                Your billing and shipping info:
                
                %s
                
                %s
                
                %s
                """, fullName, billingInfo, shippingInfo);

    }


    //!creating methods asking the questions
    public static String questions(String customMessage){
        return customMessage;
    }

    //!Creating method for billing info
    public static String billingQuestion(){
        //* Asking for billing street
        System.out.println(questions("What is your billing street: "));

        //*Storing the billing Street
        String billingStreet = addressBuilder.nextLine().trim();

        //*Asking for the billing city
        System.out.println(questions("What is your billing city: "));

        //*Storing the billing city
        String billingCity = addressBuilder.nextLine().trim();

        //*Asking the billing state
        System.out.println(questions("What is your billing state: "));

        //*Storing the billing state
        String billingState = addressBuilder.nextLine().trim();

        //*Asking billing Zip
        System.out.println(questions("What is your billing zip: "));

        //*Storing billing Zip
        String billingZip = addressBuilder.nextLine().trim();

        //!Creating a String builder
        StringBuilder billingInfo = new StringBuilder();

        //* Appending the messages for billing info
        billingInfo.append("""
                Billing Address:
                """);
        billingInfo.append(billingStreet);
        billingInfo.append(" \n");

        billingInfo.append(billingCity);
        billingInfo.append(", ");

        billingInfo.append(billingState);
        billingInfo.append(" ");

        billingInfo.append(billingZip);
        return billingInfo.toString();

    }

    //!Creating method for billing info
    public static String shippingQuestion(){

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

        //!Creating string builder
        StringBuilder shippingInfo = new StringBuilder();

        //*Appending shipping info
        shippingInfo.append("""
                Shipping Address:
                """);
        shippingInfo.append(shippingStreet);
        shippingInfo.append(" \n");

        shippingInfo.append(shippingCity);
        shippingInfo.append(", ");

        shippingInfo.append(shippingState);
        shippingInfo.append(" ");

        shippingInfo.append(shippingZip);

        return shippingInfo.toString();
    }


}
