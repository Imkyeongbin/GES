//beep 모두 발생후 프린트
//메인 스레드가 동시에 두가지 작업을 할 수 없음
package threadex1;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("beep");
			try { Thread.sleep(1000); } catch (Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("프린트");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
