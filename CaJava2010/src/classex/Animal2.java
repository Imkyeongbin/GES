package classex;

public class Animal2 {
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Animal2 lion = new Animal2();
		lion.setName("사자");
		Animal2 tiger = new Animal2();
		tiger.setName("호랑이");
		Animal2 leopard = new Animal2();
		leopard.setName("표범");
		System.out.println(lion.getName());
		System.out.println(tiger.getName());
		System.out.println(leopard.getName());
	}

}
