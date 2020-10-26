package methodex;

public class Car {
	String model;
	int speed;
	
	public Car(String model) {
		this.model = model;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for(int i=0; i<=100; i+=20) {
			this.setSpeed(i);
			System.out.println(this.model+ "이 달립니다.(시속:"+this.speed+"km/h)");
		}
	}
	
}
