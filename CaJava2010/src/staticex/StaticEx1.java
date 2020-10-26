package staticex;

public class StaticEx1 {
	int count = 0;
	StaticEx1(){
		this.count++;
		System.out.println(this.count);
	}
	public static void main(String[] args) {
		StaticEx1 st1 = new StaticEx1();
		StaticEx1 st2 = new StaticEx1();
	}

}
