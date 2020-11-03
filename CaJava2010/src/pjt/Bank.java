package pjt;

public class Bank {
	String name;
	String code;
	
	public void introductionBank(){
		System.out.println("각 은행의 소개문구입니다.");
	}
	
	public void printBank() {
		System.out.print("{"+name+":"+code+"}");
	}
}
