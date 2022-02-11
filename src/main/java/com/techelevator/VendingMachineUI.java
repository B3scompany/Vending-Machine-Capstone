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

        VendingMachine vending = new VendingMachine();
        Inventory inventory = new Inventory();
        inventory.addToInventory();
        Item item = new Item();


        if(userChoice == 1){
            //inventory.displayInventory();
            item.displayNameAndStock();
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
        System.out.println("What would you like to do? (Type the number):");
        int userChoice = scanner.nextInt();

        Inventory inventory = new Inventory();
        VendingMachine vendingMachine = new VendingMachine();
        Test test = new Test();


        if(userChoice == 1){
            System.out.println("What dollar bill are you putting in? (1, 2, 5 or 10) ");
            int dollarBill = scanner.nextInt();
            customer.feedMoney(dollarBill);

            while(customer.getCurrentMoneyProvided() <= 30){
            System.out.println("Would you like to add more money? (Y/N)");
            String yesOrNo = scanner.nextLine();
            if(yesOrNo.equalsIgnoreCase("y")){
                System.out.println("What dollar bill are you putting in? (1, 2, 5 or 10) ");
                dollarBill = scanner.nextInt();
                customer.feedMoney(dollarBill);
            }
            }
            //feed money
        }else if(userChoice == 2){
            System.out.println();
            inventory.addToInventory();
            inventory.displayInventory();



        }else if(userChoice == 3){
            System.out.println();
            //finish transaction

        }



    }
}
