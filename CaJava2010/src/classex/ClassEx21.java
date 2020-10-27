package classex;

public class ClassEx21 {
	private String color;
	private int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public static void main(String[] args) {
		ClassEx21 car = new ClassEx21();
		car.setColor("빨간색");
		car.setSpeed(100);
		System.out.println("색상: " +car.getColor());
		System.out.println("속도: " +car.getSpeed());
	}

}
