public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBER_ORDERED)
			itemsOrdered[qtyOrdered++] = disc;
		else
			System.out.println("The cart is full!");
	}
	
	public void totalCost() {
		float res = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			res += itemsOrdered[i].getCost();
		}
		System.out.printf("The price is: %.2f$", res);
	}
}
