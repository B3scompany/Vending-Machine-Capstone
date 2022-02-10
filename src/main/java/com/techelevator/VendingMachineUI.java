package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class VendingMachineUI {
    Scanner scanner =  new Scanner(System.in);
    Person customer = new Person(0);

    public void displayMainMenu(){
        System.out.println();
        System.out.println("Welcome to The Vendo-Matic 800!");
        System.out.println("> (1) Display Vending Machine Items");
        System.out.println("> (2) Purchase");
        System.out.println("> (3) Exit");
        System.out.println("What would you like to do? (Type the number):");
        int userChoice = scanner.nextInt();

        if(userChoice == 1){
            System.out.println("1");

        }else if(userChoice == 2){
            displayPurchaseProcessingMenu();
            //display purchasing process menu
        }else{
            System.out.println("Goodbye!");
            System.exit(1);
        }
    }
    public void displayPurchaseProcessingMenu(){
        System.out.println("*** PURCHASE PROCESSING ***");
        System.out.println(">(1) Feed Money");
        System.out.println(">(2) Select Product");
        System.out.println(">(3) Finish Transaction");
        System.out.println("Current Money Provided: ");
        System.out.println("What would you like to do? (Type the number):");
        int userChoice = scanner.nextInt();


        if(userChoice == 1){
            System.out.println("What dollar bill are you putting in? ");
            customer.feedMoney(scanner.nextInt());

        }else if(userChoice == 2){
            System.out.println();
            //

        }else if(userChoice == 3){
            System.out.println();

        }



    }
}
