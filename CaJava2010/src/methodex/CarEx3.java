package methodex;

public class CarEx3 {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		Car3 yourCar = new Car3();
		myCar.setAuto(true);
		myCar.setColor("은색");
		myCar.setMaxPeople(4);
		myCar.setModel("모델 3");
		myCar.setPrice(80000000);
		myCar.setSpeed(80);
		System.out.println("내 차는 자율주행 기능이 "+myCar.auto);
		System.out.println("내 차는 색상이 "+myCar.color);
		System.out.println("내 차는 인승 수가 "+ myCar.maxPeople);
		System.out.println("내 차는 모델명이 "+ myCar.model);
		System.out.println("내 차는 가격이 "+ myCar.price);
		System.out.println("내 차는 속도가 "+ myCar.speed);
		yourCar.setAuto(false);
		yourCar.setColor("백색");
		yourCar.setMaxPeople(4);
		yourCar.setModel("G80");
		yourCar.setPrice(60000000);
		yourCar.setSpeed(100);
		System.out.println("당신 차는 자율주행 기능이 "+yourCar.auto);
		System.out.println("당신 차는 색상이 "+yourCar.color);
		System.out.println("당신 차는 인승 수가 "+ yourCar.maxPeople);
		System.out.println("당신 차는 모델명이 "+ yourCar.model);
		System.out.println("당신 차는 가격이 "+ yourCar.price);
		System.out.println("당신 차는 속도가 "+ yourCar.speed);
	}

}
