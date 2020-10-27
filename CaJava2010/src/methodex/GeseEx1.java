package methodex;

public class GeseEx1 {
	private String place;
	private String hobby;
	private String dreamCar;
	private int month;
	private int date;
	private boolean holiday;
	

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getDreamCar() {
		return dreamCar;
	}

	public void setDreamCar(String dreamCar) {
		this.dreamCar = dreamCar;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

	public static void main(String[] args) {
		GeseEx1 gs = new GeseEx1();
		gs.setPlace("이탈리아");
		gs.setHobby("음악감상");
		gs.setDreamCar("테슬라 모델3");
		gs.setMonth(10);
		gs.setDate(27);
		gs.setHoliday(false);
		System.out.println("감명깊었던 곳 : "+gs.getPlace());
		System.out.println("취미 : "+gs.getHobby());
		System.out.println("드림카 : "+ gs.getDreamCar());
		System.out.println(gs.getMonth()+"/"+gs.getDate());
		System.out.println("휴일 여부 : "+ gs.isHoliday());
	}

}
