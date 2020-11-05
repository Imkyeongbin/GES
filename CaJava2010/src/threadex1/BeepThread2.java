package threadex1;

public class BeepThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("beep");
			try { Thread.sleep(500); }catch(Exception e) {}
		}
	}
}
