package pjt;

public class Account {
	long account;
	private int money;
	Bank bank;
	void printAccount() {
		bank.printBank();
		System.out.println(account+":"+money+"원");
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
