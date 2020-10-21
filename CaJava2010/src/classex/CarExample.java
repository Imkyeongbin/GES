package classex;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		//필드값 읽기
		
		System.out.println("제작 회사: "+myCar.company);
		System.out.println("모델명: "+ myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		myCar.speed = 80;
		myCar.company = "B자동차";
		myCar.color = "네이비";
		System.out.println("수정된 속도: " + myCar.speed);
		System.out.println("제작 회사2: "+myCar.company);
		System.out.println("커스텀된 색깔: " + myCar.color);
	}

}
