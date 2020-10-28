package inheritance;

public class HouseDog4 extends Dog1{
	
	
	public HouseDog4(String name) {
		this.name = name;
	}
	public HouseDog4(int nameIndex) {
		if(nameIndex == 1) {
			this.name = "yorkshire";
		}else if(nameIndex == 2) {
			this.name = "buldog";
		}else {
			this.name = "mixed dog";
		}
	}
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for "+hour+" hours");
	}

	public static void main(String[] args) {
		HouseDog4 happy = new HouseDog4("happy");
		HouseDog4 yorkshire = new HouseDog4(1);
		HouseDog4 bulldog = new HouseDog4(2);
		System.out.println(happy.name);
		System.out.println(yorkshire.name);
		System.out.println(bulldog.name);
		happy.sleep();
		happy.sleep(2);
		yorkshire.sleep();
		bulldog.sleep(2);
	}

}
