package classex;

public class Encap3 {
	int age = 35;
	int month = 10;
	private int date = 27;
	int year = 2020;
	private String nation = "Korea";
	private void printNation() {
		System.out.println(nation);
	}
	public int getDate() {
		return date; 
	}
	void day() {
		System.out.println(month+"/"+getDate()+"/"+year);
	}
	private int yearAge(int year) {
		int yearAge = age - this.year +year;
		return yearAge;
	}
	public String getNation() {
		return nation;
	}
}
