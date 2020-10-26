package staticex;

public class StaticEx2 {
	static int count = 0;
	StaticEx2(){
		this.count++;
		System.out.println(this.count);
	}
	public static void main(String[] args) {
		StaticEx2 st1 = new StaticEx2();
		StaticEx2 st2 = new StaticEx2();
	}

}
