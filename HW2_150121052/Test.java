
public class Test {

	public static void main(String[] args) {
		// I created a shoppingMall variable type of ShoppingMall class
		ShoppingMall shoppingMall = new ShoppingMall();
		// I added items orderly  
		shoppingMall.addDairy();
		shoppingMall.addFruit();
		shoppingMall.addTop();
		shoppingMall.addTrousers();
		shoppingMall.addUnderware();
		shoppingMall.addVegetable();
		
		Top top = new Top();
		top.setBasePrice(100);
		shoppingMall.addArbitrary(top);
		// I printed the content and washing instructions
		printContent(shoppingMall);
		printWashingInstructions(shoppingMall);
		System.out.println("Total bill:  " + shoppingMall.Bill());
		
		}
	
	
	public static void printWashingInstructions(ShoppingMall shoppingMall) {
		for(Item item : shoppingMall.getItems()) {
			if(item instanceof Washable) {
               ((Washable) item).howToWash();
			}
		}
		
	}
	 public static void printContent(ShoppingMall mall) {
	        for (Item item : mall.getItems()) {
	            if (item instanceof Vegan) {
	               ((Vegan) item).madeOf();
	            }
	        }
	    }
	

}
