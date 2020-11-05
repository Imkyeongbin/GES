package pjt17;

public class ATM {
	
	public static void main(String[] args) {
		ATM : while(true) {
			ATMManager.atmM.checkLog();
			ATMManager.atmM.printAll();
			System.out.println("===ATM===");
			ATMManager.atmM.printMenu();
			int sel = ATMManager.sc.nextInt();
			try {
				switch(sel) {
				case 1: ATMManager.atmM.logIn(); break;
				case 2: ATMManager.atmM.logOut(); break;
				case 3: ATMManager.atmM.accountManagementMenu(); break;
				case 4: ATMManager.atmM.depositMenu(); break;
				case 5: ATMManager.atmM.withdrawMenu(); break;
				case 6: ATMManager.atmM.transferMenu(); break;
				case 7: ATMManager.atmM.join(); break;
				case 8: ATMManager.atmM.unsubscribe(); break;
				case 9: System.out.println("이용해 주셔서 감사합니다."); break ATM;
				case 0: ATMManager.atmM.directLogOn();break;
				case 10: throw new Equal10Exception("10번은 없는 메뉴입니다.");
				default : System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
				}
				
			}catch(Equal10Exception e) {
				System.out.println();
				e.printStackTrace();
			}
			
		}
	}

}
