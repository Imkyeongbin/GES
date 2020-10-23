package methodex;

public class Calculator_2 {	
	boolean turn = false;
	public void powerOnOff(){
		turn = !turn;
		if(turn) {
			System.out.println("전원을 켭니다.");
		}else {
			System.out.println("전원을 끕니다.");
		}
	}
	public int result1() {
		int a = 5, b= 6;
		int result = a + b;
		return result;
	}
	public double result2() {
		int a = 5, b = 2;
		double result = (double)a/b;
		return result;
	}
}
