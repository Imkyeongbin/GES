package methodex;

public class Car02_2 {
	int gas;
	void setGas(int gas) {
		this.gas = gas;
		System.out.println("출발합니다.");
	}
	void run(){
		int street = gas;
		while(gas>0) {
			System.out.println("달립니다.(gas잔량:"+this.gas + ")");
			this.gas--;
		}
		System.out.println("멈춥니다.(gas잔량:"+this.gas + ")");
		System.out.println("주행 거리는 "+street+"입니다.");
		if(isLeft()) {
			System.out.println("gas가 충분합니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
	boolean isLeft() {
		if(this.gas>0) {
			System.out.println("gas가 있습니다.");
			return true;
		}else {
			System.out.println("gas가 없습니다.");
			return false;
		}
	}
}
