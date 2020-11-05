package threadex1;

public class BeepPrintExample21 {
	
	public static void main(String[] args) {
		Runnable clickTask1 = new ClickTask1();
		Runnable beepTask1 = new BeepTask1();
		Thread thread1 = new Thread(clickTask1);
		Thread thread2 = new Thread(beepTask1);
		thread1.start();
		thread2.start();
		for(int i=0; i<5; i++) {
			System.out.println("print");
			try { Thread.sleep(2000); } catch (InterruptedException e) {}
		}
	}

}
