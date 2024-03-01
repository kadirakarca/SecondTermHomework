import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AnimalFarm {
	private ArrayList<Animal> animalList = new ArrayList<>();
	private ArrayList<String> animalNames = new ArrayList<>();
	private int CAPACITY;
	private int numberOfAnimals;
	
	
	public AnimalFarm(int capacity) {

		this.CAPACITY=capacity;
	}
	public int getNumberOfAnimal(){
		return this.numberOfAnimals;
}
	public boolean addAnimal(Animal animal) throws IllegalNameExpection{
		if(numberOfAnimals==CAPACITY) {
			return false;
		}
		String name = animal.getName();
		if(animalNames.contains(name)) {
			throw new IllegalNameExpection("This name is already exist");
			
		}
		animalList.add(animal);
		animalNames.add(name);
		numberOfAnimals++;
		return true;
	}
	
	public boolean removelAnimal(String name1) {
		
		for(Animal animal : this.animalList) {
			if(animal.getName().equals(name1)) {
				
				if(animal instanceof Chicken) {
					((Chicken)animal).decrementCount();
				}
				else if(animal instanceof Donkey) {
					((Donkey)animal).decrementCount();
				}
				else if(animal instanceof Horse) {
					((Horse)animal).decrementCount();
				}
				else if(animal instanceof Pig) {
					((Pig)animal).decrementCount();
				}
				else if(animal instanceof Raven) {
					((Raven)animal).decrementCount();
				}
				else if(animal instanceof Sheep) {
					((Sheep)animal).decrementCount();
				}
				this.animalList.remove(animal);
				this.animalNames.remove(name1);
				this.numberOfAnimals--;
				return true;
			}
		}
		return true;
	}
	public void printAllAnimalGreetings() {
		for(Animal animal : this.animalList) {
			printOneAnimalGreeting(animal);
		}
	}
	public void printOneAnimalGreeting(Animal animal) {
		animal.sayGreeting();
	}
	public void printAllAnimals(){
		for(Animal animal : this.animalList)
		System.out.println(animal.toString());
	}
	public int nextYearPopulationForecast() {
		int yavrular =0;
		for(Animal animal : this.animalList) {
			yavrular += animal.getNumberOfOffsprings();
		}
		return this.numberOfAnimals + yavrular;
	}
	public void animalMovements() {
		for(Animal animal : this.animalList) {
			if(animal instanceof Bird) {
				((Bird)animal).fly();
			}
			else if(animal instanceof Mammal) {
				((Mammal)animal).walk();
			}
		}
	}
	public void eatingHabits() {
		for(Animal animal : this.animalList) {
			if(animal instanceof Bird) {
				((Bird)animal).omnivore();
			}
			else if(animal instanceof Mammal) {
				((Mammal)animal).herbivore();
			}
		}
	}
	public void sortAlphabetically() {
		ArrayList<Animal> sortList = new ArrayList<>();
		for(int k =0;k<animalList.size();k++) {
			Animal animalEkle = animalList.get(k);
			sortList.add(k, animalEkle);		
		}
		for(int j = 0;j<animalList.size()-1;j++) {
			for(int i=1+j;i<animalList.size();i++) {
				String a1 = animalNames.get(j);
				String a2 = animalNames.get(i);
				Animal animal1 = sortList.get(j);
				Animal animal2 = sortList.get(i);
				if(a1.compareTo(a2)>0) {
					sortList.set(j, animal2);
					sortList.set(i, animal1);
				}
			}
		}
		for(int i=0;i<sortList.size();i++) {
			System.out.println(sortList.get(i).getName()+ " is "+ sortList.get(i).getAge()+"years old");
		}
	}
	public void sortBasedOnLegNumber() {
		ArrayList<Animal> sortList2 = new ArrayList<>() ;
		for(int k =0;k<animalList.size();k++) {
			Animal animalEkle = animalList.get(k);
			sortList2.add(k, animalEkle);		
		}
		for(int j=0;j<animalList.size()-1;j++) {
			for(int i=1+j;i<animalList.size();i++) {
				int leg1 = animalList.get(j).getLegNumber();
				int leg2 = animalList.get(i).getLegNumber();
				Animal animal11= sortList2.get(j);
				Animal animal22 = sortList2.get(i);
				if(leg1>leg2) {
					sortList2.set(i, animal11);
					sortList2.set(j, animal22);
				}
			}
		}
		for(int i=0;i<sortList2.size();i++) {
			System.out.println(sortList2.get(i).getName()+ " is "+ sortList2.get(i).getAge()+" years old and "
					+ "have "+sortList2.get(i).getLegNumber());	
	}
	}
	public void sortBasedOnAge() {
		ArrayList<Animal> sortList3 = new ArrayList<>() ;
		for(int k =0;k<animalList.size();k++) {
			Animal animalEkle = animalList.get(k);
			sortList3.add(k, animalEkle);		
		}
		for(int j=0;j<animalList.size()-1;j++) {
			for(int i=1+j;i<animalList.size();i++) {
				int age1 = animalList.get(j).getAge();
				int age2 = animalList.get(i).getAge();
				Animal animal111= sortList3.get(j);
				Animal animal222 = sortList3.get(i);
				if(age1>age2) {
					sortList3.set(i, animal111);
					sortList3.set(j, animal222);
				}
			}
		}
		for(int i=0;i<sortList3.size();i++) {
			System.out.println(sortList3.get(i).getName()+ " is "+ sortList3.get(i).getAge()+" years old");	
	}	
	}
	public void searchBasedOnName(String name) {
		for(Animal animal : animalList) {
			if(animal.getName().equals(name)) {
				System.out.println("My name is "+ name+ " \n I'm "+
				animal.getAge()+ " years old  \n"+
				"I have "+animal.getLegNumber()+" legs ");
			}
		}
		
	}
	public void searchBasedOnAge(int age) {
		for(Animal animal : animalList) {
			if(animal.getAge()==age) {
				System.out.println("My name is "+ animal.getName()+ " \nI'm "+
				animal.getAge()+ " years old  \n"+
				"I have "+animal.getLegNumber()+" legs ");
			}
		}
		
	}
	public void printReport(String fileName) throws Exception {
		java.io.File file = new java.io.File(fileName);		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		output.println("we have a total of "+numberOfAnimals+" in the farm");
		output.println();
		for(Animal animal : this.animalList) {
		if(animal instanceof Chicken) {
		output.println("     * " +((Chicken)animal).getCount()+" of them are Chicken. Those are: \n"
				+ "        Name      Age     Leg Number \n"
				+ "        "+((Chicken)animal).getName()+"      "+((Chicken)animal).getAge()+"      "+((Chicken)animal).getLegNumber());
		}
		
		else if(animal instanceof Donkey) {
			output.println("     * " +((Donkey)animal).getCount()+" of them are Donkey. Those are: \n"
					+ "        Name      Age     Leg Number \n"
					+ "        "+((Donkey)animal).getName()+"      "+((Donkey)animal).getAge()+"      "+((Donkey)animal).getLegNumber());			
		}
		else if(animal instanceof Horse) {
			output.println("     * " +((Horse)animal).getCount()+" of them are Horse. Those are: \n"
					+ "        Name      Age     Leg Number \n"
					+ "        "+((Horse)animal).getName()+"      "+((Horse)animal).getAge()+"      "+((Horse)animal).getLegNumber());
	}
		else if (animal instanceof Pig) {
			output.println("     * " +((Pig)animal).getCount()+" of them are Pig. Those are: \n"
					+ "        Name      Age     Leg Number \n"
					+ "        "+((Pig)animal).getName()+"      "+((Pig)animal).getAge()+"      "+((Pig)animal).getLegNumber());			
	}
		else if(animal instanceof Raven) {
			output.println("     * " +((Raven)animal).getCount()+" of them are Raven. Those are: \n"
					+ "        Name      Age     Leg Number \n"
					+ "        "+((Raven)animal).getName()+"      "+((Raven)animal).getAge()+"      "+((Raven)animal).getLegNumber());			
	}
		else if(animal instanceof Sheep) {
			output.println("     * " +((Sheep)animal).getCount()+" of them are Sheep. Those are: \n"
					+ "        Name      Age     Leg Number \n"
					+ "        "+((Sheep)animal).getName()+"      "+((Sheep)animal).getAge()+"      "+((Sheep)animal).getLegNumber());					
	}
		else {
			output.println("maalesef iflerde sorun");
		}
		
		}
		output.close();
		
		
	}












}

