package com.techelevator;

import java.util.List;
import java.util.Scanner;

public class Person {
    private double currency;
    public int moneyFed;
    private List<Integer> dollarBills =  List.of(1, 2, 5, 10);

    public Person(double currency){
        this.currency = currency;

    }

    public void setMoneyFed(int moneyFed) {
        this.moneyFed = moneyFed;
    }

    public double getMoneyFed() {
        return moneyFed;
    }
    public int feedMoney(int moneyFed) {

        System.out.println("Insert up to $10 at a time.");
        System.out.println(moneyFed);
        int currentMoneyProvided = 0;
        while(moneyFed <= 10){
            currentMoneyProvided += moneyFed;
            if(currentMoneyProvided > 30){
                currentMoneyProvided = currentMoneyProvided - moneyFed;
                System.out.println("Cannot spend more than $30.");
                break;
            }

        }return currentMoneyProvided;

    }

}
