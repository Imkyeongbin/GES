package staticex;

public class Car_2 {
	int speed;
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	public static void main(String[] args) {
		Car_2 myCar = new Car_2();
		myCar.speed = 60;
		myCar.run();
	}

}
