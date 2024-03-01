
public class Top extends Clothing{
	public Top() {
		this(20.0);		
	}
	public Top(double basePrice) {
		setBasePrice(basePrice);
	}
	
	public void howToWash() {
		System.out.println("Wash Top at 40 degrees.");
		
	}
	public double calculatePrice() {
		double vatPrice = getBasePrice() +getBasePrice()*getVat();
		return vatPrice*1.2;
	}

}
