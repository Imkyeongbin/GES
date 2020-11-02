package inheritancearr;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HTire로 교체");
				car.tires[0] = new HTire("앞왼쪽", 6);
				break;
			case 2:
				System.out.println("앞오른쪽 KTire로 교체");
				car.tires[1] = new KTire("앞오른쪽", 2);
				break;
			case 3:
				System.out.println("뒤왼쪽 HTire로 교체");
				car.tires[2] = new HTire("뒤왼쪽", 3);
				break;
			case 4:
				System.out.println("뒤오른쪽 KTire로 교체");
				car.tires[3] = new KTire("뒤오른쪽", 4);
				break;
				default:
					System.out.println("Tire 정상");
			}
			System.out.println("----------------------------");
		}
	}

}
