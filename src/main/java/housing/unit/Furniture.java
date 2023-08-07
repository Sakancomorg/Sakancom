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

	public void setFurnitureName(String furnitureName) {
		furnitureName = furnitureName;
	}

	public String getFurnitureCategory() {
		return furniturecategory;
	}

	public void setFurnitureCategory(String furnitureCategory) {
		furnitureCategory = furnitureCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		contactInfo = contactInfo;
	}

	public Furniture (String furniturename ,String furniturecategory ,String description ,double price ,String contactInfo){
		this.furniturecategory=furniturecategory;
		this.furniturename=furniturename;
		this.description=description;
		this.price=price;
		this.contactInfo=contactInfo;	
	}

}
