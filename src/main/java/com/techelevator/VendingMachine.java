package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class VendingMachine implements Interfaceable{
    private Map<String, Item> inventory = new TreeMap<>();

    public VendingMachine(){

    }
    public Map<String, Item> displayInventory() {
        Map<String, Item> codePointAndItem = new TreeMap<>();
        Inventory inventory = new Inventory();
        List<Item> inventoryToMap = new ArrayList<>();
        inventoryToMap.addAll(inventory.createInventory());

        for (Item walt : inventoryToMap) {
            codePointAndItem.put(walt.getCodePoint(), walt);
        }
        for(String codePoint : codePointAndItem.keySet()){
            String name = codePointAndItem.get(codePoint).getName();
            double price = codePointAndItem.get(codePoint).getPrice();
            int stock = codePointAndItem.get(codePoint).getStock();
            System.out.println(codePoint + ") " + name + " || Price: $" + price + " || Quantity left: " + stock);
        }
        return codePointAndItem;
    }
    public void addInventory(){

    }
    public void dispenseItem(Item item){
        System.out.println("'" + item.getName() + "'  Cost: $" + item.getPrice());
        item.setStock(item.getStock() - 1);
        if(item.getType().equalsIgnoreCase("chip")){
            System.out.println("Crunch Crunch, Walt!");
        }else if(item.getType().equalsIgnoreCase("candy")){
            System.out.println("Munch Munch, Walt!");
        }else if(item.getType().equalsIgnoreCase("drink")){
            System.out.println("Glug Glug, Walt!");
        }else if(item.getType().equalsIgnoreCase("gum")){
            System.out.println("Chew Chew, Walt!");
        }

    }
    public void finishTransaction(){


    }
    public void updateStock(Item item){
        item.setStock(item.getStock() - 1);

    }


    @Override
    public void getCodePoint() {

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
