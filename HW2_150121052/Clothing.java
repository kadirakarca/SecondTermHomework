
public abstract class Clothing extends Item implements Washable {
	private double vat ;
	public Clothing() {
		this.vat=0.18;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	} 

}
