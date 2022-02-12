package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class VendingMachine implements Interfaceable{

    public VendingMachine() {

    }



    public Map<String, Item> vendingMachine() {
        Map<String, Item> codePointAndItem = new TreeMap<>();
        Inventory inventory = new Inventory();
        List<Item> testList = new ArrayList<>();
        testList.addAll(inventory.createInventory());

        for (Item walt : testList) {
            codePointAndItem.put(walt.getCodePoint(), walt);

        }
        for(String codePoint : codePointAndItem.keySet()){
            System.out.println(codePoint + ") " + codePointAndItem.get(codePoint).getName() + " || Price: $" +
                    codePointAndItem.get(codePoint).getPrice() + " || Quantity left: "
                    + codePointAndItem.get(codePoint).getStock());
        }
        return codePointAndItem;

    }
    public void addInventory(){

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