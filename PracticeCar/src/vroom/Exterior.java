package vroom;

public class Exterior extends CarPart {

	String color;
	String make;
	String model;
	
	public Exterior(String color, String make, String model, int condition) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.condition = condition;
	}
	
	public void startExterior() {
		System.out.println("Exterior headlights and/or mirrors are lit");
		if(condition <= 40) {
			System.out.println("CAUTION: exterior headlights and/or mirrors may not work"
					+ " correctly. Drive at your own risk!");
		}
	}
	
	@Override
	public void function() {
		System.out.println("EXTERIOR");
		System.out.printf("%-30s %-15s%n","Color:", color);
		System.out.printf("%-30s %-15s%n","Make:", make);
		System.out.printf("%-30s %-15s%n","Model:", model);
		System.out.printf("%-30s %-15s%n","Status:", this.status());
		System.out.println("\nStarting exterior systems...\n");
		startExterior();
	}
}
