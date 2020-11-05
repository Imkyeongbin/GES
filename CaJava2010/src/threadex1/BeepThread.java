//스레드의 하위 클래스로 작업 스레드 정의하여 작업내용 포함
package threadex1;

public class BeepThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("beep");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
