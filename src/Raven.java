
public class Raven extends Bird{
	private static int count =0;
	public Raven(String name, int age) {
		super(name,age);
		setLegNumber(2);
		setNumberOfOffsprings(5);
		setPregnancyPerYear(1);
		count++;
		
	}
	public void sayGreeting() {
		System.out.println("A happy country where we poor animals shall rest forever");
	}
	public int getCount() {
		return count;
	}
	public void decrementCount(){
		count--;
	}
}
