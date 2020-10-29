package selfproject;

import java.util.Scanner;

public class ATMManager extends Manager{
	static Scanner sc = new Scanner(System.in);
	User[] users;
	int log = -1;
	ATMManager(){
		users = new User[5];
		long accs[][] = {{12345}, {23456,24680}, {34567}, {45678},{1002331626707L}};
		int moneys[][] = {{10000}, {20000, 25000}, {30000}, {40000}, {50000}};
		String ids[] = {"abab", "bcbc", "cdcd", "dede", "fdt15ss"};
		String pws[] = {"1234", "2345", "3456", "4567", "5678"};
		String names[] = {"박지성", "김연아", "손흥민", "황희찬", "임경빈"};
		for(int i=0; i<users.length; i++) {
			users[i] = new User();
			users[i].id = ids[i];
			users[i].pw = pws[i];
			users[i].name = names[i];
			users[i].acc = new Account[3];
			for(int j=0; j<accs[i].length;j++) {
				users[i].acc[j] = new Account();
				users[i].acc[j].account = accs[i][j];
				users[i].acc[j].money = moneys[i][j];
				users[i].accCount++;
			}
		}
	}
	@Override
	public void logIn() {
		if(log== -1) {
			System.out.println("로그인할 유저 ID를 입력해주세요");
			System.out.print(">");
			String id = sc.next();
			System.out.println("비밀 번호를 입력해주세요");
			System.out.print(">");
			String password = sc.next();
			for(int i=0; i<users.length ; i++) {
				if(users[i].id.equals(id)&&users[i].pw.equals(password)) {
					log = i;
				}
			}
			if(log == -1) {
				System.out.println("ID나 비밀번호가 틀립니다.");
			}else {
				System.out.println(users[log].name+"님, 환영합니다.");
			}
		}else {
			System.out.println(users[log].name+"님, 이미 로그인 중...");
		}
		
	}

	@Override
	public void logOut() {
		if(log != -1) {
			int idx = log;
			log = -1;
			System.out.println(users[idx].name+"님, 로그아웃 되었습니다.");
		}else {
			System.out.println("이미 로그아웃되어있습니다.");
		}
	}

	public int selectAcc() {
		for(int j=0; j<users[log].accCount;j++) {
			System.out.println("["+(1+j)+"]"+users[log].acc[j].account);
		}
		System.out.println("몇 번 계좌를 선택하시겠습니까?");
		System.out.print("(종료 0)>");
		int accSel = sc.nextInt() -1;
		return accSel;
	}
	@Override
	public void checkMenu() {
		if(log != -1) {
			while(true) {
				System.out.println("[조회]");
				int accSel =selectAcc();
				if(accSel<users[log].accCount&& accSel>=0) {
					users[log].acc[accSel].printAccount();
					System.out.println();
				}else if(accSel == -1){
					System.out.println("종료합니다.");
					break;
				}else {
					System.out.println("잘못된 선택입니다.");
				}
			}
		}else {
			System.out.println("로그인 후 이용 가능합니다.");
		}
	}
	
	@Override
	public void depositMenu() {
		if(log != -1) {
			while(true) {
				System.out.println("[입금]");
				int accSel =selectAcc();
				if(accSel<users[log].accCount&& accSel>=0) {
					deposit(accSel);
				}else if(accSel == -1){
					System.out.println("종료합니다.");
					break;
				}else {
					System.out.println("잘못된 선택입니다.");
				}
			}
		}else {
			System.out.println("로그인 후 이용 가능합니다.");
		}
	}
	public void deposit(int accSel) {
		while(true) {
			System.out.println("얼마를 입금하시겠습니까?");
			System.out.print("(종료 0)>");
			int addMoney = sc.nextInt();
			if(addMoney == 0) {
				return;
			}else if(addMoney<0) {
				System.out.println("잘못된 금액입니다.");
			}else {
				users[log].acc[accSel].money += addMoney;
				System.out.println("입금되었습니다.");
				break;
			}
		}
	}

	@Override
	public void withdrawMenu() {
		if(log != -1) {
			while(true) {
				System.out.println("[인출]");
				int accSel =selectAcc();
				if(accSel<users[log].accCount&& accSel>=0) {
					withdraw(accSel);
				}else if(accSel == -1){
					System.out.println("종료합니다.");
					break;
				}else {
					System.out.println("잘못된 선택입니다.");
				}
			}
		}else {
			System.out.println("로그인 후 이용 가능합니다.");
		}		
	}
	
	public void withdraw(int accSel) {
		while(true) {
			System.out.println("얼마를 출금하시겠습니까?");
			System.out.print("(종료 0)>");
			int minusMoney = sc.nextInt();
			if(minusMoney == 0) {
				return;
			}else if(minusMoney<0) {
				System.out.println("잘못된 금액입니다.");
			}else if(minusMoney>users[log].acc[accSel].money){
				System.out.println("잔액 초과입니다.");
			}else {
				users[log].acc[accSel].money -= minusMoney;
				System.out.println("출금되었습니다.");
				break;
			}
		}
	}

	@Override
	public void transferMenu() {
		if(log != -1) {
			while(true) {
				System.out.println("[이체]");
				int accSel =selectAcc();
				if(accSel<users[log].accCount&& accSel>=0) {
					transfer(accSel);
				}else if(accSel == -1){
					System.out.println("종료합니다.");
					break;
				}else {
					System.out.println("잘못된 선택입니다.");
				}
			}
		}else {
			System.out.println("로그인 후 이용 가능합니다.");
		}				
	}
	public void transfer(int accSel) {
		while(true) {
			System.out.println("이체할 계좌를 적으세요");
			System.out.print("(종료 0)>");
			long transferAcc = sc.nextLong();
			int checkI =-1;
			int checkJ =-1;
			for(int i=0; i<users.length;i++) {
				for(int j=0; j<users[log].accCount;j++) {
					if(users[i].acc[j].account == transferAcc) {
						checkI = i;
						checkJ = j;
					}
				}
			}
			if(checkI != -1) {
				while(true) {
					System.out.println("이체할 금액을 적으세요");
					System.out.print("(종료 0)>");
					int transferMoney = sc.nextInt();
					
					if(transferMoney == 0) {
						return;
					}else if(transferMoney<0) {
						System.out.println("잘못된 금액입니다.");
					}else if(transferMoney>users[log].acc[accSel].money){
						System.out.println("잔액 초과입니다.");
					}else {
						users[log].acc[accSel].money -= transferMoney;
						users[checkI].acc[checkJ].money += transferMoney;
						System.out.println("이체되었습니다.");
						break;
					}
				}
			}else if(transferAcc ==0){
				System.out.println("종료합니다.");
				return;
			}else {
				System.out.println("해당 계좌가 존재하지 않습니다.");
			}
		}
	}
	
	@Override // 아직 작성안됨
	public void join() {
		if(log == -1) {
			System.out.println("환영합니다.");
			while(true) {
				System.out.println("사용하실 ID를 적어주세요.");
				System.out.print(">");
				String id = sc.next();
				
				if(checkId(id)==-1) {
					
				}
			}
			
			
		}else {
			System.out.println("로그아웃 상태에서 사용 가능한 메뉴입니다.");
		}
	}	
	public int checkId(String id) {// 아직 작성안됨
		int check = -1;
		for(int i=0; i<users.length;i++) {
			
		}
		return check;
	}

	@Override
	public void unsubscribe() {
		if(log != -1) {
			while(true) {
				System.out.println("정말 탈퇴하시겠습니까?");
				System.out.print("(Y/N)>");
				String unsubscribeSel = sc.next();
				if(unsubscribeSel.equals("y")||unsubscribeSel.equals("Y")) {
					if(users.length==1) {
						users = null;
					}else {
						User[] temp = users;
						users = new User[temp.length-1];
						int j=0;
						for(int i=0;i<temp.length; i++) {
							if(i!=log) {
								users[j] = temp[i];
								j++;
							}
						}
						temp = null;
					}
					System.out.println("탈퇴되었습니다.");
					log = -1;
					return;
				}else if(unsubscribeSel.equals("N")||unsubscribeSel.equals("n")) {
					System.out.println("탈퇴되지 않았습니다.");
					break;
				}else {
					System.out.println("잘못된 선택입니다.");
				}
				
			}
		}else {
			System.out.println("로그인 후 이용 가능합니다.");
		}
	}
	
	@Override
	public void printMenu() {
		System.out.println("1.로그인");
		System.out.println("2.로그아웃");
		System.out.println("3.조회");
		System.out.println("4.입금");
		System.out.println("5.출금");
		System.out.println("6.이체");
		System.out.println("7.가입");
		System.out.println("8.탈퇴");
		System.out.println("9.종료");
		System.out.print("선택하세요 >");
	}
	
	public void checkLog() {
		if(log != -1) {
			System.out.println(users[log].name+"님 로그인 중");
		}
	}
	
	public void printAll() {
		for(int i=0; i<users.length; i++) {
			users[i].printUser();
		}
	}
}
