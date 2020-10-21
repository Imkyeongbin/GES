package classex;

public class Car4 {
	String model;
	String color;
	int maxSpeed;
	double fuelEfficiency;
	int price;
	//생성자
	Car4(String model){
		this.model = model;
	}
	Car4(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car4(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car4(String model, String color, int maxSpeed, double fuelEfficiency){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	Car4(String model, String color, int maxSpeed, double fuelEfficiency, int price){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.fuelEfficiency = fuelEfficiency;
		this.price = price;
	}	
}
