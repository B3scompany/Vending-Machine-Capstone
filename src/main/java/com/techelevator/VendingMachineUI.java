package com.techelevator;

import com.sun.security.jgss.GSSUtil;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class VendingMachineUI {
    Scanner scanner =  new Scanner(System.in);
    Person customer = new Person(0);
    VendingMachine vendingMachine = new VendingMachine();
    Map<String, Item> purchaseMenu = new TreeMap<>();



    public void displayMainMenu(){
        System.out.println();
//        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("Welcome to The Vendo-Matic 800!");
        System.out.println("> (1) Display Vending Machine Items");
        System.out.println("> (2) Purchase");
        System.out.println("> (3) Exit");
        System.out.println("What would you like to do? (Type the number):");
        String userChoice = scanner.next();

        VendingMachine vending = new VendingMachine();
        Inventory inventory = new Inventory();
        Item item = new Item();
        List<Item> listOfItems = new ArrayList<>();
        listOfItems.addAll(inventory.createInventory());



        if(userChoice.equalsIgnoreCase("1")){
            vending.displayInventory();
            displayMainMenu();

        }else if(userChoice.equalsIgnoreCase("2")){
            displayPurchaseProcessingMenu();
            //display purchasing process menu
        }else if(userChoice.equalsIgnoreCase("3")) {
            System.out.println("Goodbye.");
            System.exit(1);
        }else{
            System.out.println("Quit trying to break me...");
            displayMainMenu();
        }
    }
    public void displayPurchaseProcessingMenu() {
        System.out.println("*** PURCHASE PROCESSING ***");
        System.out.println(">(1) Feed Money ($30 LIMIT)");
        System.out.println(">(2) Select Product");
        System.out.println(">(3) Finish Transaction");
        System.out.println();
        System.out.println("Spendable Money: $" + customer.getCurrentMoneyProvided());
        System.out.println("What would you like to do? (Type the number):");
        Inventory inventory = new Inventory();
        String userChoice = scanner.next();
        int dollarBill = 0;


        if (userChoice.equalsIgnoreCase("1")) {
            String yesOrNo = "";
                System.out.println("What dollar bill are you putting in? (1, 2, 5 or 10) ");
                    dollarBill = scanner.nextInt();
                    if (dollarBill == 1 || dollarBill == 2 || dollarBill == 5 || dollarBill == 10) {
                        if (dollarBill > 10) {
                            System.out.println("Enter a smaller bill.");
                            displayPurchaseProcessingMenu();
                        }
                        customer.feedMoney(dollarBill);
                        System.out.println("Spendable Money: $" + customer.getCurrentMoneyProvided());
                        do {
                            System.out.println("Would you like to add more money? (Y/N)");
                            yesOrNo = scanner.next();
                            if (!yesOrNo.equalsIgnoreCase("y")) {
                                displayPurchaseProcessingMenu();
                                break;
                            }
                            System.out.println("What dollar bill are you putting in? (1, 2, 5 or 10) ");
                            dollarBill = scanner.nextInt();
                            customer.feedMoney(dollarBill);
                            System.out.println("Spendable Money: $" + customer.getCurrentMoneyProvided());
                        } while (yesOrNo.equalsIgnoreCase("y"));
                    } else {
                        System.out.println("Enter a valid bill.");
                        displayPurchaseProcessingMenu();
                    }



            //feed money
        } else if (userChoice.equalsIgnoreCase("2")) {
            vendingMachine.displayInventory();
            purchaseMenu.putAll(vendingMachine.displayInventory());

            System.out.println();
            System.out.println("What do you want to buy? Select an option between A1 --> D4: ");
            System.out.println("Spendable Money: $" + customer.getCurrentMoneyProvided());
            String pickedItem = scanner.next();
            pickedItem.toUpperCase();
            for (String choice : purchaseMenu.keySet()) {
                if(pickedItem.equalsIgnoreCase(choice)) {
                    if (customer.getCurrentMoneyProvided() < purchaseMenu.get(choice).getPrice()) {
                        System.out.println("Get your money up.");
                        System.out.println("You have: $" + customer.getCurrentMoneyProvided());
                        System.out.println("You need: $" + purchaseMenu.get(choice).getPrice());
                        displayPurchaseProcessingMenu();
                    }
                    if (purchaseMenu.get(choice).getStock() > 0) {
                        vendingMachine.dispenseItem(purchaseMenu.get(choice)); //prints name and price
                        double moneyRemaining = customer.getCurrentMoneyProvided() - purchaseMenu.get(choice).getPrice();
                        customer.setCurrentMoneyProvided(moneyRemaining);
                        vendingMachine.updateStock(purchaseMenu.get(choice));

                        displayPurchaseProcessingMenu();
                    }
                }
            }if(!purchaseMenu.containsKey(pickedItem)){
                System.out.println("Item doesn't exist");
                displayPurchaseProcessingMenu();
            }
        }
        else if(userChoice.equalsIgnoreCase("3")){
            System.out.println();
            //finish transaction

        }
        else{
            System.out.println("Choose the number of the option you want. ");
            displayPurchaseProcessingMenu();
        }

    }
}
