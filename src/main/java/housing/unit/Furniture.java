package housing.unit;

public class Furniture {
	private String furnitureName;
	private String furnitureCategory;
	private String description;
	private double price;
	private String ContactInfo;
	
	public String getFurnitureName() {
		return furnitureName;
	}

	public void setFurnitureName(String furnitureName) {
		furnitureName = furnitureName;
	}

	public String getFurnitureCategory() {
		return furnitureCategory;
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
		return ContactInfo;
	}

	public void setContactInfo(String contactInfo) {
		ContactInfo = contactInfo;
	}

	public Furniture (String FurnitureName ,String FurnitureCategory ,String Description ,double price ,String ContactInfo){
		this.furnitureCategory=FurnitureCategory;
		this.furnitureName=FurnitureName;
		this.description=Description;
		this.price=price;
		this.ContactInfo=ContactInfo;	
	}

}
