package methodex;

public class Car2 {
	String model;
	int speed1;
	int speed2;
	
	void setSpeed1(int speed1) {
		this.speed1 = speed1;
		System.out.println("내차 속도는 "+this.speed1);
	}
	void setSpeed2(int speed2) {
		this.speed2 = speed2;
		System.out.println("당신차 속도는 "+this.speed2);
	}
}
