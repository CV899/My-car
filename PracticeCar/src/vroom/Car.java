package vroom;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	List<CarPart> carParts = new ArrayList<CarPart>();
	
	public Car() {
		Wheels wheels = new Wheels(19, "Goodyear", 90);
		Engine engine = new Engine(6, 2000, 70);
		Exterior exterior = new Exterior("blue", "Toyota", "Corolla", 30);
		Interior interior = new Interior("Tan","Leather", 5, 67);
		FuelTank tank = new FuelTank("Unleaded gasoline", 50, 70, 70);
		carParts.add(wheels);
		carParts.add(engine);
		carParts.add(exterior);
		carParts.add(interior);
		carParts.add(tank);
	}

	public void run() {
		System.out.println("\nInitiating all systems...\n\n");
		
		for(CarPart e : carParts) {
			e.function();
			System.out.println();
			System.out.println("------------------------------\n");
		}
		System.out.println("Car has successfully started - happy driving!");
	}
}
