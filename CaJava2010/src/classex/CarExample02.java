package classex;

public class CarExample02 {

	public static void main(String[] args) {
		Car02 myCar = new Car02("검정", 3000, "v80");
		System.out.println("색깔: " + myCar.color);
		System.out.println("배기량: " + myCar.cc);
		System.out.println("모델: "+ myCar.model);
	}

}
