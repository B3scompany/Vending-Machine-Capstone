package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class VendingMachineUI {
    Scanner scanner =  new Scanner(System.in);
    Person customer = new Person(0);


    public void displayMainMenu(){
        System.out.println();
//        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("Welcome to The Vendo-Matic 800!");
        System.out.println("> (1) Display Vending Machine Items");
        System.out.println("> (2) Purchase");
        System.out.println("> (3) Exit");
        System.out.println("What would you like to do? (Type the number):");
        int userChoice = scanner.nextInt();

        VendingMachine vending = new VendingMachine();
        Inventory inventory = new Inventory();
        Item item = new Item();
        List<Item> listOfItems = new ArrayList<>();
        listOfItems.addAll(inventory.createInventory());



        if(userChoice == 1){
            vending.vendingMachine();
            displayMainMenu();

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
        Inventory inventory = new Inventory();
        int userChoice = scanner.nextInt();
        int dollarBill = 0;




        if(userChoice == 1){
            String yesOrNo = "";
            System.out.println("What dollar bill are you putting in? (1, 2, 5 or 10) ");
            dollarBill = scanner.nextInt();
            if(dollarBill > 10){
                System.out.println("Enter a smaller bill.");
                displayPurchaseProcessingMenu();
            }
            customer.feedMoney(dollarBill);
            do{
                System.out.println("Would you like to add more money? (Y/N)");
                yesOrNo = scanner.next();
                if(!yesOrNo.equalsIgnoreCase("y")){
                    displayPurchaseProcessingMenu();
                    break;
                }
                System.out.println("What dollar bill are you putting in? (1, 2, 5 or 10) ");
                dollarBill = scanner.nextInt();
                customer.feedMoney(dollarBill);
            }while(yesOrNo.equalsIgnoreCase("y"));

            //feed money
        }else if(userChoice == 2){
            VendingMachine vendingMachine = new VendingMachine();
            Map<String, Item> purchaseMenu = new TreeMap<>();
            purchaseMenu.putAll(vendingMachine.vendingMachine());
            System.out.println();
            System.out.println();
            System.out.println("What do you want to buy? Select an option between A1 --> D4: ");
            String pickedItem = scanner.next();
            for(String choice : purchaseMenu.keySet()){
                pickedItem = choice;
                if(!purchaseMenu.containsKey(choice)){
                    System.out.println("Item doesn't exist");
                    displayPurchaseProcessingMenu();
                    break;
                }
                if (purchaseMenu.get(choice).getStock() <= 0){
                    System.out.println("Sold out.");
                    displayPurchaseProcessingMenu();
                    break;
                }
                if (purchaseMenu.get(choice).equals(userChoice)) {
                    System.out.println("Hope your happy with your selection");
                    System.out.println();
                }
            }


        }else if(userChoice == 3){
            System.out.println();
            //finish transaction

        }



    }
}