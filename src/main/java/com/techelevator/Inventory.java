package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private List<String> listOfItems = new ArrayList<>();
    private Item item;

    public Inventory(Item item) {
        this.item = item;

    }

    public Inventory() {

    }

    public Item getItem() {
        return item;
    }

    public List<String> getListOfItems() {
        return listOfItems;
    }

    public void displayInventory() {
        for (String name : listOfItems) {
            System.out.println(name);
        }

    }

    public void addToInventory() {

        File file = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\|");
                listOfItems.add(words[1]);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
}
