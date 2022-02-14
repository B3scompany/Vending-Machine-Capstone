package com.techelevator;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println(6.95 % 0.05);
		Inventory inventory = new Inventory();
		inventory.createInventory();
		VendingMachineUI menus = new VendingMachineUI();
		menus.displayMainMenu();
	}
}