package methodex;

import java.util.Scanner;

public class CarExample02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car02 myCar = new Car02();
		System.out.println("주입할 gas 리터수를 적으세요");
		System.out.print(">");
		myCar.setGas(sc.nextInt());
		System.out.println("주행할 거리를 적으세요");
		System.out.print(">");
		myCar.setStreet(sc.nextInt());
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
		
	}

}
