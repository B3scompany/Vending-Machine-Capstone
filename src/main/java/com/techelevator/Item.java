package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Item {
    private String codePoint;
    private String name;
    private double price;
    private String type;
    private int stock = 5;

    public Item(String codePoint, String name, double price, String type, int stock){
//        this.codePoint = codePoint;
//        this.name = name;
//        this.price = price;
//        this.type = type;
//        this.stock = stock;


        File file = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\|");
                this.codePoint = words[0];
                this.name = words[1];
                this.price = Double.parseDouble(words[2]);
                this.type = words[3];
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
    public Item(String name){


    public Item(String codePoint, String name, double price, String type){
    }

    public String getCodePoint() {
        return codePoint;
    }

    public void setCodePoint(String codePoint) {
        this.codePoint = codePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getStock(){
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
