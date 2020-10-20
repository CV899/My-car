package vroom;

public class Engine extends CarPart {

	int cylinders;
	int RPM;
	
	public Engine(int cylinders, int RPM, int condition) {
		this.cylinders = cylinders;
		this.RPM = RPM;
		this.condition = condition;
	}
	
	public void startEngine() {
		if(condition >= 40) {
			System.out.println(cylinders + "-cylinder engine is ready to go");
		} else {
			System.out.println("Engine failed to start");
			System.exit(0);
		}
	}
	
	@Override
	public void function() {
		System.out.println("ENGINE");
		System.out.printf("%-30s %-15s%n","Cylinders:", cylinders);
		System.out.printf("%-30s %-15s%n","RPM:", RPM);
		System.out.printf("%-30s %-15s%n","Status:", this.status());
		System.out.println("\nStarting engine...\n");
		startEngine();
	}
	
}
