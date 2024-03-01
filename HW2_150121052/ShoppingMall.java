import java.util.ArrayList;

public class ShoppingMall {
ArrayList<Item> items = new ArrayList<Item>();

public ArrayList<Item> getItems() {
	return items;
}
//these methods add items
public void addDairy() {
	items.add(new Dairy());
}
public void addFruit() {
	items.add(new Fruit());
}
public void addTop() {
	items.add(new Top());
}
public void addTrousers() {
	items.add(new Trousers());
}
public void addUnderware() {
	items.add(new Underware());
}
public void addVegetable() {
	items.add(new Vegetable());
}
public void addArbitrary(Item item) {
	items.add(item);
}
// this method addition all items price
public double Bill() {
	double bill =0;
	for(Item item : items) {
		bill += item.calculatePrice();
	}
	return bill;
}






}
