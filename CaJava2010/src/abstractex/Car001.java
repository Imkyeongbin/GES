package abstractex;

public abstract class Car001 {
	String name;
	boolean phone;
	Car001(String name){
		this.name = name;
	}
	public abstract void run(int speed);
	public abstract void go(String place);
	public abstract void rest();
	public abstract void boast(String people);
	public abstract int sell();
}
