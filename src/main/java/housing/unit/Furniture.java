<<<<<<< HEAD:src/main/java/housing/unit/Furniture.java
package housing.unit;
=======
package Sakancom;
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/main/java/Sakancom/Furniture.java

public class Furniture {
	private String FurnitureName;
	private String FurnitureCategory;
	private String Description;
	private double price;
	private String ContactInfo;
	
	public String getFurnitureName() {
		return FurnitureName;
	}

	public void setFurnitureName(String furnitureName) {
		FurnitureName = furnitureName;
	}

	public String getFurnitureCategory() {
		return FurnitureCategory;
	}

	public void setFurnitureCategory(String furnitureCategory) {
		FurnitureCategory = furnitureCategory;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
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
		this.FurnitureCategory=FurnitureCategory;
		this.FurnitureName=FurnitureName;
		this.Description=Description;
		this.price=price;
		this.ContactInfo=ContactInfo;	
	}

}
