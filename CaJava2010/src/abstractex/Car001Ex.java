package abstractex;

import java.util.Scanner;

public class Car001Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BenzE300 e300 = new BenzE300("벤츠 E300");
		BMW_X3 x3 = new BMW_X3("BMW X3");
		TeslaModel3 model3 = new TeslaModel3("테슬라 모델 3");
		String place;
		String people;
		while(true) {
			System.out.println("폰을 가지고 계십니까?");
			System.out.print("(y/n)>");
			char phone = sc.next().charAt(0);
			if(phone=='Y'||phone=='y') {
				e300.phone = true;
				x3.phone = true;
				model3.phone = true;
				break;
			}else if(phone=='N'||phone=='n') {
				e300.phone = false;
				x3.phone = false;
				model3.phone = false;
				break;
			}else {
				System.out.println("잘못된 표현입니다. 다시 선택해 주세요.");
			}
		}
		sc.nextLine();
		System.out.println("어떤 장소를 좋아하십니까?");
		System.out.print(">");
		place = sc.nextLine(); 
		System.out.println("누구와 어울리길 좋아하십니까?");
		System.out.print(">");
		people = sc.nextLine();
		
		System.out.println("-"+e300.name+"의 활용법");
		e300.run(100);
		e300.go(place);
		e300.rest();
		e300.boast(people);
		System.out.println("당신은 "+e300.sell()+"만원 정도 가격에 판매할 수도 있습니다.");
		System.out.println();
		
		System.out.println("-"+x3.name+"의 활용법");
		x3.run(100);
		x3.go(place);
		x3.rest();
		x3.boast(people);
		System.out.println("당신은 "+x3.sell()+"만원 정도 가격에 판매할 수도 있습니다.");
		System.out.println();
		
		System.out.println("-"+model3.name+"의 활용법");
		model3.run(100);
		model3.go(place);
		model3.rest();
		model3.boast(people);
		System.out.println("당신은 "+model3.sell()+"만원 정도 가격에 판매할 수도 있습니다.");
		System.out.println();
	}

}
