package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    public List<Item>inventory = new ArrayList<>();

    public VendingMachine() {
        File file = new File("vendingmachine.csv");
         try (Scanner scanner = new Scanner(file)){
             while (scanner.hasNextLine()){
                 String line = scanner.nextLine();
                 String words[] = line.split("\\|");

                 System.out.println("Item at A1" + );


             }

         } catch (FileNotFoundException e) {
             System.out.println("File not found. ");
         }



//    private static File getDestinationFileFromUser(Scanner i){
//        System.out.println("What is the destination file? ");
//        String path = i.nextLine();
//
//        File destinationFile = new File(path);
//        try {
//            destinationFile.createNewFile();
//        }
//        catch (IOException e) {
//            System.out.println("Cant access file");
//        }
//        return destinationFile;
//    }
}
