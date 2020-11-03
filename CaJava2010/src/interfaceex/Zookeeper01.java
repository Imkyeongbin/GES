package interfaceex;

public class Zookeeper01 {
	public void feed(Predator01 predator) {
		System.out.println(predator.getFood());
	}
	public static void main(String[] args) {
		Zookeeper01 zookeeper = new Zookeeper01();
		Tiger01 tiger = new Tiger01();
		Lion01 lion = new Lion01();
		Leopard01 leopard = new Leopard01();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		zookeeper.feed(leopard);
		
	}

}
