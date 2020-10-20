package vroom;

public class Interior extends CarPart {
	
	String color;
	String seatType;
	int numSeats;
	
	public Interior(String color, String seatType, int numSeats, int condition) {
		this.color = color;
		this.seatType = seatType;
		this.numSeats = numSeats;
		this.condition = condition;
	}
	
	public void startInterior() {
		System.out.println("Dashboard is fired up");
		if(condition <= 40) {
			System.out.println("CAUTION: critical dashboard functionalities may not work"
					+ " correctly. Drive at your own risk!");
		}
	}
	
	@Override
	public void function() {
		System.out.println("INTERIOR");
		System.out.printf("%-30s %-15s%n","Color:", color);
		System.out.printf("%-30s %-15s%n","Seat type:", seatType);
		System.out.printf("%-30s %-15s%n","Number of seats:", numSeats);
		System.out.printf("%-30s %-15s%n","Status:", this.status());
		System.out.println("\nStarting interior systems...\n");
		startInterior();
	}

}
