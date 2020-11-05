package threadex1;

public class ThreadA extends Thread{
	public ThreadA() {
		this.setName("Thread 알파");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+ "가 출력한 내용");
		}
	}
}
