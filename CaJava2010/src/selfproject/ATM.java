package selfproject;

public class ATM {

	public static void main(String[] args) {
		ATMManager atmM = new ATMManager();
		ATM : while(true) {
			atmM.checkLog();
			atmM.printAll();
			System.out.println("===ATM===");
			atmM.printMenu();
			int sel = ATMManager.sc.nextInt();
			switch(sel) {
			case 1: atmM.logIn(); break;
			case 2: atmM.logOut(); break;
			case 3: atmM.checkMenu(); break;
			case 4: atmM.depositMenu(); break;
			case 5: atmM.withdrawMenu(); break;
			case 6: atmM.transferMenu(); break;
			case 7: atmM.join(); break;
			case 8: atmM.unsubscribe(); break;
			case 9: System.out.println("이용해 주셔서 감사합니다."); break ATM; 
			default : System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
			
		}
	}

}
