package interfaceex;

public class Zookeeper {
	public void feed(Tiger tiger) {
		System.out.println("호랑이가 오면 사과를 던져준다.");
	}
	public void feed(Lion lion) {
		System.out.println("사자가 오면 바나나를 던져준다.");
	}
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		
	}

}
