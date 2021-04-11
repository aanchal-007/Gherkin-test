package linkedinlearning.cucumbercourse;

public class RestaurantMenuItem {
	
	private String ItemName;
	private String Description;
	private int price;

	
	public RestaurantMenuItem(String itemName, String description, int price) {
		super();
		ItemName = itemName;
		Description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemName() {
		return ItemName;
	}
	
}
