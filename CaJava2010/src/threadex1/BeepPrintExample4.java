package threadex1;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		Runnable beepTask41 = new BeepTask41();
		Thread thread41 = new Thread(beepTask41);
		
		Runnable beepTask42 = new BeepTask42();
		Thread thread42 = new Thread(beepTask42);
		
		Runnable beepTask43 = new BeepTask43();
		Thread thread43 = new Thread(beepTask43);
		
		thread41.start();
		
		try {
			thread41.join();
		} catch (InterruptedException e1) {
		}
		thread42.start();
		
		try {
			thread42.join();
		} catch (InterruptedException e) {
		}
		
		thread43.start();
		
		try {
			thread43.join();
		} catch (InterruptedException e) {
		}
		System.out.println("end");
	}

}
