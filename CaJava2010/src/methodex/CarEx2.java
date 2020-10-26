package methodex;

public class CarEx2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		Car2 yourCar = new Car2();
		myCar.model = "G80";
		System.out.println("내차는 "+myCar.model);
		myCar.setSpeed1(80);
		yourCar.model = "V80";
		System.out.println("당신차는 "+yourCar.model);
		yourCar.setSpeed2(100);
		
	}

}
