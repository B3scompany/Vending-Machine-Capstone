package org.B3scompany;

public class Application {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.createInventory();
		VendingMachineUI menus = new VendingMachineUI();
		menus.displayMainMenu();
	}
}