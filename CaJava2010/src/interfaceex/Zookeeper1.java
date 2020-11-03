package interfaceex;

public class Zookeeper1 {
	public void feed(Predator1 predator) {
		System.out.println(predator.getFood());
	}
	public static void main(String[] args) {
		Zookeeper1 zookeeper = new Zookeeper1();
		Tiger1 tiger = new Tiger1();
		Lion1 lion = new Lion1();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		
	}

}
