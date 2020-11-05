package threadex1;

public class BeepPrintExample31 {

	public static void main(String[] args) {
		Thread beepThread1 = new BeepThread1();
		Thread beepThread2 = new BeepThread2();
		
		beepThread1.start();
		beepThread2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("print");
			try { Thread.sleep(500); }catch(Exception e) {}
		}
	}

}
