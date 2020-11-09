package ch11;

import java.util.ArrayList;

public class CarEx {
	public static void main(String[] args) {
		ArrayList<Car> a1 = new ArrayList<Car>();
		a1.add(new Car());
		a1.add(new Bus());
		a1.add(new Taxi());
		
		for(Car c : a1) {
			c.print();
			if(c instanceof Bus) {
				// ((Bus)c).move();
				// 아래 두줄 위 한줄 같음
				Bus b = (Bus)c;
				b.move();
			}
		}
	}
}
