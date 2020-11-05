//메인 스레드와 작업 스레드 동시 실행

package threadex1;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		//객체 생성
		for(int i=0; i<5; i++) {
			System.out.println("프린트");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
