package classex;

public class Animal01 {
	String name;
	Animal01(){	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Animal01 cat = new Animal01();
		cat.setName("야옹이");
		System.out.println(cat.name);
		Animal01 dog = new Animal01();
		dog.setName("멍멍이");
		System.out.println(dog.name);
	}

}
