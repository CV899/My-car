package vroom;

public class Wheels extends CarPart {
	
	int inches;
	String brand;
	
	public Wheels(int inches, String brand, int condition) {
		this.inches = inches;
		this.brand = brand;
		this.condition = condition;
	}
	
	public void turnWheels() {	
		System.out.println(inches + "-inch " + brand + " wheels are a-turnin'");
		if(condition <= 40) {
			System.out.println("CAUTION: tires are in poor shape. Drive at your own risk!");
		}
	}
	
	@Override
	public void function() {
		System.out.println("WHEELS");
		System.out.printf("%-30s %-15s%n","Size (inches):", inches);
		System.out.printf("%-30s %-15s%n","Brand:", brand);
		System.out.printf("%-30s %-15s%n","Status:", this.status());
		System.out.println("\nStarting steering systems...\n");
		turnWheels();
	}
}
