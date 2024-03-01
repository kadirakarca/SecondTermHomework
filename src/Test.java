import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Animal Farm simulation program");
		System.out.println("Please enter the Animal farm capacity");
		int capacity = input.nextInt();
		AnimalFarm animalFarm = new AnimalFarm(capacity);
		boolean doğrulama = true;
		while(doğrulama) {
		System.out.println("0- exit program \n"
				+ "1- add animal \n"
				+ "2-remove animal \n"
				+ "3- search animal \n"
				+ "4- sort animals \n"
				+ "5- calculate next year's animal population estimate \n"
				+ "6- print all animal's movements \n"
				+ "7- print all animal's eating habits \n"
				+ "8- print report \n"
				+ "Please your choice: ");
		int islem = input.nextInt();
		if(islem==1) {
			System.out.print("1-Chicken \n"
					+ "2-Donkey \n"
					+ "3-Horse \n"
					+ "4-Pig \n"
					+ "5-Raven \n"
					+ "6-Sheep \n"
					+ "Select animal type: ");
			int animalType = input.nextInt();
			System.out.println("enter the name:");
			String animalisim = input.next();
			System.out.println("enter the age:");
			int animalage = input.nextInt();
			if(animalType==1) {
				Chicken Chicken = new Chicken(animalisim,animalage);
				try {
					animalFarm.addAnimal(Chicken);
				} catch (IllegalNameExpection e) {
					
					e.printStackTrace();
				}
			}
			else if(animalType==2) {
				Donkey Donkey = new Donkey(animalisim,animalage);
				try {
					animalFarm.addAnimal(Donkey);
				} catch (IllegalNameExpection e) {
					e.printStackTrace();
				}
			}
			else if(animalType==3) {
				Horse Horse = new Horse (animalisim,animalage);
				try {
					animalFarm.addAnimal(Horse);
				} catch (IllegalNameExpection e) {
					e.printStackTrace();
				}
			}
			else if(animalType==4) {
				Pig Pig = new Pig(animalisim,animalage);
				try {
					animalFarm.addAnimal(Pig);
				} catch (IllegalNameExpection e) {
					e.printStackTrace();
				}
			}
			else if(animalType==5) {
				Raven Raven = new Raven(animalisim,animalage);
				try {
					animalFarm.addAnimal(Raven);
				} catch (IllegalNameExpection e) {
					e.printStackTrace();
				}	
			}
			else if(animalType==6) {
				Sheep Sheep = new Sheep(animalisim,animalage);
				try {
					animalFarm.addAnimal(Sheep);
				} catch (IllegalNameExpection e) {
					e.printStackTrace();
				}
			}
		}
		else if(islem==3) {
			System.out.print("1-Search on name \n"
					+ "2-Search on age \n");
			int search = input.nextInt();
			
			if(search==1) {
				System.out.println("please enter the name");
				String searchName = input.next();
				animalFarm.searchBasedOnName(searchName);
			}
			if(search==2) {
				System.out.println("please enter the age");
				int searchAge = input.nextInt();
				animalFarm.searchBasedOnAge(searchAge);
			}
		}
		else if(islem==2) {
			System.out.print("What is the animal's name: ");
			String removename = input.next();
			animalFarm.removelAnimal(removename);
		}
		else if(islem==4) {
			System.out.println("1-Sort base on name \n"
					+ "2-Sort base on leg number \n"
					+ "3-sort base on age \n"
					+ "4-Sort base on addition date " );
			int sort = input.nextInt();
			if(sort==1) {	
				animalFarm.sortAlphabetically();
			}
			if(sort==2) {
				animalFarm.sortBasedOnLegNumber();
			}
			if(sort==3) {
				animalFarm.sortBasedOnAge();
			}
			if(sort==4) {
				animalFarm.printAllAnimals();
			}
		}
		else if(islem==5) {
			System.out.println(animalFarm.nextYearPopulationForecast());
		}
		else if(islem==6) {
			animalFarm.animalMovements();
		}
		else if(islem==7) {
			animalFarm.eatingHabits();
		}
		else if(islem==8) {
			System.out.print("Enter the file name");
			String fileName = input.next();
			try {
				animalFarm.printReport(fileName);
			} catch (Exception e) {
				System.out.println("bu isimde dosya var");
			}
				}	
		else if(islem==0) {
			System.out.println("Thank you for use our program!! Have a nice day");
			doğrulama=false;
		}	
		}		
	}
}
