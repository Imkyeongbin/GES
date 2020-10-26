package staticex;

public class StaticEx3 {
	static int count = 0;
	StaticEx3(){
		this.count++;
	}
	public static int getcount() {
		return count;
	}
	public static void main(String[] args) {
		StaticEx3 st1 = new StaticEx3();
		StaticEx3 st2 = new StaticEx3();
		StaticEx3 st3 = new StaticEx3();
		System.out.println(StaticEx3.getcount());
	}

}
