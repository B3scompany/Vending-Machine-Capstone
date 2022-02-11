package com.techelevator;

import java.util.List;
import java.util.Scanner;

public class Person {
    private double currency;
    private int currentMoneyProvided;


    public Person(double currency){
        this.currency = currency;

    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public int getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    public void feedMoney(int moneyFed) {

        currentMoneyProvided = 0;
        while(moneyFed <= 10){
            currentMoneyProvided += moneyFed;
            if(currentMoneyProvided > 30){
                System.out.println("Current Money Provided: " + (currentMoneyProvided - moneyFed));
                System.out.println("You spent too much already.");
                break;
            }
            System.out.println("Current Money Provided: " + currentMoneyProvided);
                break;
            }

        }

    }

