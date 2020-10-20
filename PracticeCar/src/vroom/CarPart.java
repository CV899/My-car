package vroom;

public class CarPart implements Functional {
	
	int condition;
	
	public void function() {
		System.out.println("(Default function) Helps the car system run smoothly.");
	}
	
	public String status() {
		if(condition >= 90) {
			 return "GREAT";
		} else if(condition >= 70) {
			return "GOOD";
		} else if(condition >= 40) {
			return "OK";
		} else {
			return "POOR";
		}
	}
	
}
