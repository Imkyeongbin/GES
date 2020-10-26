package methodex;

public class CarEx21 {
	public static void main(String[] args) {
		Car21 myCar = new Car21("G80", 80);
		Car21 yourCar = new Car21("V80", 100);
		
		System.out.println("내차는 "+myCar.model);
		System.out.println("내차 속도는 "+myCar.speed);
		System.out.println("당신차는 "+yourCar.model);
		System.out.println("당신차 속도는 "+yourCar.speed);
	}
}
