package methodex;

import java.util.Scanner;

public class CarExample02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car02_2 myCar = new Car02_2();
		System.out.println("주입할 가스양을 적으시오.");
		System.out.print(">");
		int gas = sc.nextInt();
		myCar.setGas(gas);
		myCar.run();
		
	}

}
