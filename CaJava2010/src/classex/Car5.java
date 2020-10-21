package classex;

public class Car5 {
	String model;
	String color;
	int maxSpeed;
	double fuelEfficiency;
	int price;
	//생성자
	Car5(String model){
		this(model, "검정", 350, 10.5, 20000000);
	}
	Car5(String model, String color){
		this(model, color, 350, 10.5, 20000000);
	}
	Car5(String model, String color, int maxSpeed){
		this(model, color, maxSpeed, 10.5, 20000000);
	}
	Car5(String model, String color, int maxSpeed, double fuelEfficiency){
		this(model, color, maxSpeed, fuelEfficiency, 20000000);
	}
	public Car5(String model, String color, int maxSpeed, double fuelEfficiency, int price) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.fuelEfficiency = fuelEfficiency;
		this.price = price;
	}
}
