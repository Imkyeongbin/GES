package classex;

public class CarExample01 {

	public static void main(String[] args) {
		Car01 myCar = new Car01();
		
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("제작회사: "+ myCar.company);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
	}

}
