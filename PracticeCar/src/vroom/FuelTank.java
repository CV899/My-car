package vroom;

public class FuelTank extends CarPart{
	
	String fuelType;
	int tankSize;
	int gasAmount; // 100 = full tank of gas, 0 = no gas
	
	public FuelTank(String fuelType, int tankSize, int gasAmount, int condition) {
		this.fuelType = fuelType;
		this.tankSize = tankSize;
		this.gasAmount = gasAmount;
		this.condition = condition;
	}
	
	public void startFuelTank() {
		if(condition >= 40) {
			if(gasAmount == 0) {
				System.out.println("Failed to start fuel system - no fuel available");
				System.exit(0);
			} else if(gasAmount < 15) {
				System.out.println("CAUTION: low fuel");
			}
			System.out.println("Fuel system is ready");
		} else {
			System.out.println("Failed to start fuel system");
			System.exit(0);
		}
		
	}
	
	@Override
	public void function() {
		System.out.println("FUEL TANK");
		System.out.printf("%-30s %-15s%n","Fuel type:", fuelType);
		System.out.printf("%-30s %-15d%n","Tank size (Liters):", tankSize);
		System.out.printf("%-30s %-15d%n", "Gas (Percentage available):", gasAmount);
		System.out.printf("%-30s %-15s%n","Status:", this.status());
		System.out.println("\nStarting fuel system...\n");
		startFuelTank();
		
	}
	
	
}
