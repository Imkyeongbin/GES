package thread;

public class TestThread1 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			
			System.out.println("thread run.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TestThread1 test = new TestThread1();
		test.start();
		for(int i=0;i<10; i++) {
			System.out.println("main run.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
