package pizzaBillGenerator;

public class Pizza {

	private double price;
	private boolean veg;
	private double basePizzaPrice;
	
	private double extraCheesePrice = 100.0;
	private double extraToppingsPrice = 150.0;
	private double backPackPrice = 20.0;
	
	private boolean isExtraCheeseAdded;
	private boolean isExtraToppingsAdded;
	private boolean isTakeAwayOpted;

	public Pizza(boolean veg) {
		this.veg = veg;
		
		if(this.veg) {
			this.price = 300.0;
		}
		else {
			this.price = 400.0;
		}
		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraToppingsPrice;
	}
	
	public void takeAway() {
		isTakeAwayOpted = true;
		this.price += backPackPrice;
	}
	
	public void getBill() {
		System.out.println("Base Pizza: "+basePizzaPrice);
		if(isExtraCheeseAdded) {
			System.out.println("Extra Cheese: "+extraCheesePrice);
		}
		if(isExtraToppingsAdded) {
			System.out.println("Toppings: "+extraToppingsPrice);
		}
		if(isTakeAwayOpted) {
			System.out.println("Take away: "+backPackPrice);
		}
		
		System.out.println("Your Total bill: "+this.price);
	}

}
