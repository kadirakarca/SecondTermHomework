
public class Underware	extends Clothing {
	public Underware() {
		this(30.0);
	}
	public Underware(double basePrice) {
		setBasePrice(basePrice);
	}
	public void howToWash() {
		System.out.println("Wash Underware at 60 degrees.");
		
	}
	public double calculatePrice() {
		double vatPrice = getBasePrice() +getBasePrice()*getVat();
		return vatPrice*1.45;
	}
}
