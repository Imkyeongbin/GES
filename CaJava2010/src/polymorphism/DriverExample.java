package polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		SUV suv = new SUV();
		Benz benz = new Benz();
		Tesla tesla = new Tesla();
		
		driver.drive(bus); // 자동 타입 변환 Vehicle
		driver.drive(taxi);// 자동 타입 변환 Vehicle
		driver.drive(suv);
		driver.drive(benz);
		driver.drive(tesla);
	}

}
