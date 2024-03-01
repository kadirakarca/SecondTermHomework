
public class Dairy extends Food{
	public Dairy() {
		this(8.0);
	}
	public Dairy(double basePrice) {
		setBasePrice(basePrice);
	}

	public double calculatePrice() {
		double vatPrice= getBasePrice() +getBasePrice() * getVat();
		return vatPrice*1.3;
	}

}
