package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class VendingMachine implements Interfaceable{
    List<Item> inventory = new ArrayList<>();
    Map<String, Item> grid = new HashMap<>();


    public void vendingMachine() {



    }
    public void addInventory(){

    }



    @Override
    public void getCodePoint() {
        List<String> codePoints = new ArrayList<>();

        File file = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\|");
                codePoints.add(words[0]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        for(String codePoint : codePoints){
            System.out.println(codePoint);
        }
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPurchasePrice() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
}
