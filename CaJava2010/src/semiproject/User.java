package semiproject;

public class User {
	Account[] acc = new Account[3];
	String id;
	String pw;
	String name;
	int accCount = 0;
	public void printUser() {
		System.out.print(id+"/"+pw+"/"+name+"=>");
		if(accCount>0) {
			System.out.println();
			for(int j=0; j<accCount;j++) {
				acc[j].printAccount();
			}
			System.out.println("------------------------------------------");
		}else {
			System.out.println("계좌 없음");
		}
	}
}
