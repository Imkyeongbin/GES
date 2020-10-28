package classex;

public class Mp {
	String color;
	int memory;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color.equals("skyblue")||color.equals("red")||color.equals("silver"))
			this.color = color;
		else {
			System.out.println("지원하지 않는 색상입니다.");
		}
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		if(memory == 64 || memory == 128 || memory == 256)
			this.memory = memory;
		else {
			System.out.println("지원하지 않는 용량입니다.");
		}
	}
	public static void main(String[] args) {
		Mp mp = new Mp();
		mp.setColor("silver");
		mp.setMemory(128);
		System.out.println("색상:"+mp.getColor());
		System.out.println("용량:"+mp.getMemory());
		
		Mp mp2 = new Mp();
		mp2.setColor("white");
		mp2.setMemory(100);
		System.out.println("색상:"+mp2.getColor());
		System.out.println("용량:"+mp2.getMemory());
		
	}

}
