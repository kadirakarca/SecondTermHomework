
public class Chicken extends Bird{
	private static int count=0;
	public Chicken(String name , int age) {
		super(name,age);
		setLegNumber(2);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(200);
		count++;
	}
	public void sayGreeting() {
		System.out.println("I have nothing to say other than I am against Pigs!");
	}
	public int getCount() {
		return count;
	}
	public void decrementCount(){
		count--;
	}
}
