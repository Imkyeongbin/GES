package classex;

public class Animal3 {
	String name;
	
	public String getName() {
		return name;
	}

	Animal3(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		Animal3 lion = new Animal3("사자");
		Animal3 tiger = new Animal3("호랑이");
		Animal3 leopard = new Animal3("표범");
		System.out.println(lion.getName());
		System.out.println(tiger.getName());
		System.out.println(leopard.getName());
	}

}
