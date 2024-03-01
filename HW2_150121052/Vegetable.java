
public class Vegetable extends Food implements Vegan,Washable {
	public Vegetable() {
		this(10.0);
	}
	public Vegetable(double basePrice) {
		setBasePrice(basePrice);
	}
	public void howToWash() {
		System.out.println("Wash Vegetable with warm water.");
		
	}
	public void madeOf() {
		System.out.println("It is made only of vegetables.");
		
	}
	
	public double calculatePrice() {
		double vatPrice = getBasePrice()+getBasePrice()*getVat();
		return vatPrice*1.25;
	}
}
