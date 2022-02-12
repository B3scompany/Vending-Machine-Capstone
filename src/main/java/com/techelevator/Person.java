package com.techelevator;

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

    public int getCurrentMoneyProvided() {return currentMoneyProvided;}

    public int feedMoney(int moneyFed) {

//        do{
//            currentMoneyProvided += moneyFed;
//            System.out.println("Current Money Provided: " + currentMoneyProvided);
//
//        }while(currentMoneyProvided <= 30 && moneyFed <= 10);

        while (moneyFed <= 10) {
            currentMoneyProvided += moneyFed;
            if (currentMoneyProvided > 30) {
                currentMoneyProvided = currentMoneyProvided - moneyFed;
                System.out.println("Current Money Provided: " + currentMoneyProvided);
                System.out.println("You spent too much already.");
                break;
            }
            System.out.println("Current Money Provided: " + currentMoneyProvided);
            break;
        }
        return currentMoneyProvided;
    }

}