package methodex;

public class Car02 {
	int gas;
	int street;
	void setGas(int liter) {
		this.gas = liter;
		System.out.println("gas가 있습니다.");
	}
	void setStreet(int street) {
		this.street = street;
	}
	void run() {
		for(int i=0; i<street; i++ ) {
			System.out.println("달립니다.(gas잔량:"+this.gas+")");
			this.gas--;
		}
		System.out.println("멈춥니다.(gas잔량:"+this.gas+")");
		if(isLeftGas()==false) System.out.println("gas가 없습니다.");
	}
	boolean isLeftGas() {
		if(this.gas>0) return true;
		else return false;
	}
}
