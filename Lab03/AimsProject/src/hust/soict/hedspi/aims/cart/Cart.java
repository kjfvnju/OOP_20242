package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import java.util.Scanner;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered++] = disc;
			System.out.printf("Add %s succesfully!\n", disc.getTitle());
		}
		else
			System.out.println("The cart is full!");
		displayCartItem();
	}
	
	public float totalCost() {
		float res = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			res += itemsOrdered[i].getCost();
		}
		return res;
	}
	
	public void displayCartItem() {
		int j = 1;
		System.out.println("************************************CART*********************************");
		for(int i = 0; i < qtyOrdered; ++i) {
			System.out.println(j++ + ". " + itemsOrdered[i].toString());
		}
		System.out.printf("%-20s%.2f$\n", "Total cost: ", totalCost());
		System.out.println("*************************************************************************\n");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean change = false;
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsOrdered[i].equals(disc)) {
				for(int j = i; j < qtyOrdered-1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[--qtyOrdered] = null;

				change = true;
				break;
			}
		}
		if(change) {
			System.out.printf("Remove %s succesfully!\n", disc.getTitle());
		}
		else {
			System.out.printf("Remove %s failed!\n", disc.getTitle());
		}
		displayCartItem();
	}
	
	public void searchDvdById() {
		int j = 0;
		System.out.print("Input the id of the DVD you want to find: ");
		Scanner input = new Scanner(System.in);
		int temp = input.nextInt();
		input.close();
		System.out.println("************************************CART*********************************");
		for(int i = 0; i < MAX_NUMBER_ORDERED; ++i) {
			if(itemsOrdered[i] != null && itemsOrdered[i].getId() == temp) {
				System.out.println(++j + ". " + itemsOrdered[i].toString());
			}
		}
		if(j == 0) {
			System.out.println("No matched DVD.");
		}
		System.out.println("*************************************************************************\n");
	}
	
	public void searchDvdByTitle() {
		int j = 0;
		System.out.print("Input the title of the DVD you want to find: ");
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		input.close();
		System.out.println("************************************CART*********************************");
		for(int i = 0; i < MAX_NUMBER_ORDERED; ++i) {
			if(itemsOrdered[i] != null && itemsOrdered[i].isMatch(temp)) {
				System.out.println(++j + ". " + itemsOrdered[i].toString());
			}
		}
		if(j == 0) {
			System.out.println("No matched DVD.");
		}
		System.out.println("*************************************************************************\n");
	}
}
