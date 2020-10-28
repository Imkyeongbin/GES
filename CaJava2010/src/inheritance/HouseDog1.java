package inheritance;

public class HouseDog1 extends Dog1{
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for "+hour+" hours");
	}
	public void sleep(String act) {
		System.out.println(this.name+" zzz in house is "+act);
	}
	public void sleep(double angle) {
		System.out.println(this.name+" zzz in house in "+angle+"degree");
	}
	public void sleep(boolean mine) {
		System.out.println(this.name+" zzz in house is mine that is "+mine);
	}
	public static void main(String[] args) {
		HouseDog1 houseDog = new HouseDog1();
		houseDog.setName("happy");
		houseDog.sleep();
		houseDog.sleep(3);
		houseDog.sleep("snoring");
		houseDog.sleep(83.2);
		houseDog.sleep(false);
	}

}
