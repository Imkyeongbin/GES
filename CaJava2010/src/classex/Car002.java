package classex;

public class Car002 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car002(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car002(String model, String color){
		this(model, color, 0);
	}
	Car002(String model){
		this(model, null, 0);
	}
	Car002(){
		
	}
}
