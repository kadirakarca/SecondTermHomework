
public abstract class Food extends Item{
	private double vat;
	public Food() {
		this.vat=0.08;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
 
}
