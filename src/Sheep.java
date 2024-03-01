
public class Sheep extends Mammal{
	private static int count =0;
	public Sheep(String name, int age) {
		super(name,age);
		setLegNumber(4);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(1);
		count++;
		
	}
	public void sayGreeting() {
		System.out.println("Four legs good, two legs better");
	}
	public int getCount() {
		return count;
	}
	public void decrementCount(){
		count--;
	}
}
