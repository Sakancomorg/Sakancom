package housing.unit;

public class Furniture {
	private String furniturename;
	private String furniturecategory;
	private String description;
	private double price;
	private String contactInfo;
	
	public String getFurnitureName() {
		return furniturename;
	}
	public String getFurnitureCategory() {
		return furniturecategory;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public String getContactInfo() {
		return contactInfo;
	}


	public Furniture (String furniturename ,String furniturecategory ,String description ,double price ,String contactInfo){
		this.furniturecategory=furniturecategory;
		this.furniturename=furniturename;
		this.description=description;
		this.price=price;
		this.contactInfo=contactInfo;	
	}

}
