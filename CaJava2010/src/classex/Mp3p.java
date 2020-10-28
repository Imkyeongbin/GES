package classex;

public class Mp3p {
	String color;
	int storage;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.equals("빨간색")||color.equals("파란색")||color.equals("노란색")) {
			this.color = color;
		}else {
			System.out.println("지원하지 않는 색상입니다.");
		}
	}
	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		if(storage == 64|| storage == 128 || storage == 256) {
			this.storage = storage;
		}else {
			System.out.println("지원하지 않는 용량입니다.");
		}
	}

	public static void main(String[] args) {
		Mp3p m3 = new Mp3p();
		m3.setColor("빨간색");
		m3.setStorage(64);
		System.out.println("색상:"+m3.getColor());
		System.out.println("용량:"+m3.getStorage());
		Mp3p m3_2 = new Mp3p();
		m3_2.setColor("살구색");
		m3_2.setStorage(100);
		System.out.println("색상:"+m3_2.getColor());
		System.out.println("용량:"+m3_2.getStorage());
	}

}
