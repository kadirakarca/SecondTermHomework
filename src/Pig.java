
public class Pig extends Mammal {
	private static int count =0;
	public Pig(String name, int age) {
		super(name,age);
		setLegNumber(4);
		setNumberOfOffsprings(12);
		setPregnancyPerYear(2);
		count++;
		
	}
	public void sayGreeting() {
		System.out.println("Life will go on as it has always gone –that is, badly!");
	}
	public int getCount() {
		return count;
	}
	public void decrementCount(){
		count--;
	}
}
