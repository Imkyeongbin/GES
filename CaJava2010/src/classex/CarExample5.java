package classex;

public class CarExample5 {

	public static void main(String[] args) {
		Car5 myCar1 = new Car5("v80");
		System.out.println("모델명: " + myCar1.model);
		
		Car5 myCar2 = new Car5("v80", "검정");
		System.out.println("모델명: " + myCar2.model);
		System.out.println("색깔: " + myCar2.color);
		
		Car5 myCar3 = new Car5("v80", "검정", 350);
		System.out.println("모델명: " + myCar3.model);
		System.out.println("색깔: " + myCar3.color);
		System.out.println("최고속도: " + myCar3.maxSpeed);
		
		Car5 myCar4 = new Car5("v80", "검정", 350, 10.5);
		System.out.println("모델명: " + myCar4.model);
		System.out.println("색깔: " + myCar4.color);
		System.out.println("최고속도: " + myCar4.maxSpeed);
		System.out.println("연비: " + myCar4.fuelEfficiency);
		
		Car5 myCar5 = new Car5("v80", "검정", 350, 10.5, 20000000);
		System.out.println("모델명: " + myCar5.model);
		System.out.println("색깔: " + myCar5.color);
		System.out.println("최고속도: " + myCar5.maxSpeed);
		System.out.println("연비: " + myCar5.fuelEfficiency);
		System.out.println("가격: " + myCar5.price);
	}

}
