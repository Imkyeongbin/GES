package inheritance;

public class HouseDog3 extends Dog{
	public void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	public void sleep(int hour) {
		System.out.println(this.name + " zzz in house for "+hour+" hours");
	}
	public static void main(String[] args) {
		HouseDog3 dog = new HouseDog3();
		dog.setName("Happy");
		System.out.println(dog.name);
		dog.sleep();
		dog.sleep(2);
	}
}
