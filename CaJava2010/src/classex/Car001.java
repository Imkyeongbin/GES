package classex;

public class Car001 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car001(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car001(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car001(String model){
		this.model = model;
	}
	Car001(){
		
	}
}
