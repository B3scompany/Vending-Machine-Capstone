package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
<<<<<<< HEAD
    public List<Item>inventory = new ArrayList<>();
=======
    public List<Item> inventory = new ArrayList<>();
>>>>>>> 47b3f9fbd107d8547d4a1a576e2fbae6135a60cd

    public VendingMachine() {
        File file = new File("vendingmachine.csv");
         try (Scanner scanner = new Scanner(file)){
             while (scanner.hasNextLine()){
                 String line = scanner.nextLine();
                 String words[] = line.split("\\|");

<<<<<<< HEAD
                 System.out.println("Item at A1" + );


             }

         } catch (FileNotFoundException e) {
             System.out.println("File not found. ");
         }
=======
    public void vendingMachine() {
>>>>>>> 47b3f9fbd107d8547d4a1a576e2fbae6135a60cd




}
