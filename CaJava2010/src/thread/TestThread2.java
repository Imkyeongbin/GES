package thread;

public class TestThread2 extends Thread{
	int seq;
	public TestThread2(int seq) {
		this.seq = seq;
	}
	public void run() {
		System.out.println(this.seq+" thread start.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.seq+" thread end.");
	}
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Thread t = new TestThread2(i);
			t.start();
		}
		System.out.println("main end.");
	}
}
