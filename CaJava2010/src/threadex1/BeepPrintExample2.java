//메인 스레드와 작업 스레드 동시 실행
package threadex1;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		//작업 스레드에 의해 BeepTask 객체의 run 메소드가 실행
		
		for(int i=0; i<5; i++) {
			System.out.println("프린트");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
