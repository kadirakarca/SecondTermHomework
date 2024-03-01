
public class Animal {
	private String name;
	private int legNumber;
	private int age;
	private int pregnancyPerYear;
	private int numberOfOffsprings;
	
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void sayGreeting() {
		System.out.println("Have nothing say");
		
	}
	public void reproduce() {
		System.out.println("None of your business");
	}
	public String toString() {	
		return "My name is "+name+ "!\n" +
				"I'am " +age+" years old!\n"+
				"I have "+legNumber+ " legs";
	}
	public void setLegNumber(int legNumber) {
		this.legNumber=legNumber;
	}
	
	public int getLegNumber() {
		return this.legNumber;
	}
	public void setPregnancyPerYear(int year) {
		this.pregnancyPerYear=year;
	}
	
	public int getPregnancyPerYear() {
		return this.pregnancyPerYear;
	}
	public void setNumberOfOffsprings(int offspring) {
		this.numberOfOffsprings=offspring;
	}
	public int getNumberOfOffsprings() {
		return this.numberOfOffsprings;
	}
	
}
