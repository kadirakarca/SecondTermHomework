
public class Fruit extends Food implements Washable,Vegan {
	public Fruit() {
		this(6.0);
	}
	public Fruit(double basePrice) {
		setBasePrice(basePrice);
	}

	public void madeOf() {
		System.out.println("It is made only of fruits.");
		
	}
	
	public void howToWash() {
		System.out.println("Wash Fruit with cold water.");
		
	}
	public double calculatePrice() {
		double vatPrice = getBasePrice() + getBasePrice()*getVat();
		return vatPrice*1.2;
	}
}
