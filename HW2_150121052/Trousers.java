
public class Trousers extends Clothing{
	public Trousers() {
		this(40.0);
	}
	public Trousers(double basePrice) {
		setBasePrice(basePrice);
	}

	public void howToWash() {
		System.out.println("Wash Trousers at 30 degrees.");
	}
	public double calculatePrice() {
		double vatPrice = getBasePrice() + getBasePrice()*getVat();
		return vatPrice*1.2;
	}

}
