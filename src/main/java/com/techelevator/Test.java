package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    public Test(){


    }
    public void itemTest(){

        File file = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\|");
                Item item = new Item(words[0], words[1], Double.parseDouble(words[2]), words[3], 5);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
    public void multipleMaps(){
        Map<String, Item> codePointAndItem = new HashMap<>();
        Inventory inventory = new Inventory();
        List<Item> testList = new ArrayList<>();
        testList.addAll(inventory.createInventory());
        for(Item walt : testList){
            codePointAndItem.put(walt.getCodePoint(), walt);
        }





    }



}
