package housing.unit;

public class LocationInfo {
	 private String location;
	    private String photo;
	    private double rent;
	    private int id;

	    public LocationInfo(String location, String photo, double rent, int id) {
	        this.location = location;
	        this.photo = photo;
	        this.rent = rent;
	        this.id = id;
	    }

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getPhoto() {
			return photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}

		public double getRent() {
			return rent;
		}

		public void setRent(double rent) {
			this.rent = rent;
		}

		public int getId() {
			return id;
		}

		

}
