package com.techelevator;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VendingMachine vending = new VendingMachine();
		vending.vendingMachine();
		VendingMachineUI mainMenu = new VendingMachineUI();
		mainMenu.displayMainMenu();





	}
}
