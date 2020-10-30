package inheritance;

public class Car1 {
	Tire1 fTire;
	Tire1 bTire;
	public Car1(){
		fTire = new Tire1("앞쪽", 5);
		bTire = new Tire1("뒤쪽", 3);
	}
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		fTire.count--;
		bTire.count--;
		if(fTire.count==0&&bTire.count!=0) {
			System.out.println("*** "+fTire.location+" Tire 펑크 ***");
			System.out.println(bTire.location+" Tire 수명: "+bTire.count);
			return 1;
		}else if(fTire.count!=0&&bTire.count==0) {
			System.out.println(fTire.location+" Tire 수명: "+fTire.count);
			System.out.println("*** "+bTire.location+" Tire 펑크 ***");
			return 2;
		}else if(fTire.count==0&&bTire.count==0) {
			System.out.println("*** "+fTire.location+" Tire 펑크 ***");
			System.out.println("*** "+bTire.location+" Tire 펑크 ***");
			return 3;
		}else {
			System.out.println(fTire.location+" Tire 수명: "+fTire.count);
			System.out.println(bTire.location+" Tire 수명: "+bTire.count);
		}
		return 0;
	}

}
