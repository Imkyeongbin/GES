// Runnable은 인터페이스 타입이므로 구현 객체를 만들어 대입(run())
package threadex1;

public class BeepTask implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("beep");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}