	
public class Automobile{
	
	private String make;
	private String model;
	private int year;
	private double price;
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setYear(int year) {
		if (year > 1990 && year < 2025 ) {
			this.year = year;
		}	
	}
	
	public int getYear() {
		return year;
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public Automobile(String make, String model, int year, double price) {
		setMake(make);
		setModel(model);
		setYear(year);
		setPrice(price);
	}
	
	public static void main(String[] args) {
		
		Automobile vehicle1 = new Automobile("Honda", "Accord", 2020, 25000.00);
		System.out.printf("Make: %s%nModel: %s%nYear: %d%nPrice: %.2f%n", vehicle1.getMake(), 
				vehicle1.getModel(), vehicle1.getYear(), vehicle1.getPrice());
	}
}	
	

