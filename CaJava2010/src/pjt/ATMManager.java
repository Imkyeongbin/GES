package pjt;

import java.util.Scanner;

public class ATMManager extends Manager{
	static Scanner sc = new Scanner(System.in);
	static ATMManager atmM = new ATMManager();
	AccountManager accM = new AccountManager();
	User[] users;
	int log = -1;
	Bank[] banks;
	ATMManager(){
		users = new User[5];
		long accs[][] = {{12345}, {23456,24680}, {34567}, {45678},{1002331626707L}};
		int moneys[][] = {{10000}, {20000, 25000}, {30000}, {40000}, {50000}};
		String codes[][] = {{"03"},{"11","20"},{"03"},{"11"},{"20"}};
		String ids[] = {"abab", "bcbc", "cdcd", "dede", "fdt15ss"};
		String pws[] = {"1234", "2345", "3456", "4567", "5678"};
		String names[] = {"박지성", "김연아", "손흥민", "황희찬", "임경빈"};
		int bankSize = 3;
		banks = new Bank[bankSize];
		banks[0] = new IBK();
		banks[1] = new Nonghyup();
		banks[2] = new WooriBank();
		
		int accountSize = 3;
		
		for(int i=0; i<users.length; i++) {
			users[i] = new User();
			users[i].id = ids[i];
			users[i].pw = pws[i];
			users[i].name = names[i];
			users[i].acc = new Account[accountSize];
			for(int j=0; j<accs[i].length;j++) {
				users[i].acc[j] = new Account();
				users[i].acc[j].account = accs[i][j];
				users[i].acc[j].setMoney(moneys[i][j]);
				
				users[i].acc[j].bank = banks[accBankCheck(codes[i][j])];
				users[i].accCount++;
			}
		}
	}
	public int accBankCheck(String code) {
		for(int i=0; i<banks.length; i++) {
			if(banks[i].code.equals(code)) {
				return i;
			}
		}
		return -1;
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
	public void accountManagementMenu() {
		if(log != -1) {
			while(true) {
				System.out.println("[계좌 관리]");
				printAccountManagementMenu();
				int accountManagementSel = sc.nextInt();
				if(accountManagementSel == 0) break;
				if(accountManagementSel == 1) {
					accM.createAcc();
				}else if(accountManagementSel == 2){
					accM.deleteAcc();
				}else if(accountManagementSel == 3) {
					accM.checkAcc();
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}else {
			System.out.println("로그인 후 이용 가능합니다.");
		}
	}
	
	public void printAccountManagementMenu() {
		System.out.println("1.계좌 생성");
		System.out.println("2.계좌 삭제");
		System.out.println("3.계좌 조회");
		System.out.println("0.뒤로 가기");
		System.out.print(">");
	}
	
	@Override
	public void depositMenu() {
		if(log != -1) {
			while(true) {
				System.out.println("[입금]");
				int accSel =selectAcc();
				if(accSel<users[log].accCount&& accSel>=0) {
					users[log].acc[accSel].bank.introductionBank();
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
				users[log].acc[accSel].setMoney(users[log].acc[accSel].getMoney() + addMoney);
				System.out.println(addMoney+"원 입금되었습니다.");
				System.out.println("잔액은 "+users[log].acc[accSel].getMoney()+"원 입니다.");
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
					users[log].acc[accSel].bank.introductionBank();
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
			}else if(minusMoney>users[log].acc[accSel].getMoney()){
				System.out.println("잔액 초과입니다.");
			}else {
				users[log].acc[accSel].setMoney(users[log].acc[accSel].getMoney() - minusMoney);
				System.out.println(minusMoney+"원 출금되었습니다.");
				System.out.println("잔액은 "+users[log].acc[accSel].getMoney()+"원 입니다.");
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
					users[log].acc[accSel].bank.introductionBank();
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
			String code = bankCode(); 
			if(code.equals("0")) {
				break;
			}
			System.out.println("이체할 번호를 적으세요");
			System.out.print("(종료 0)>");
			long transferAcc = sc.nextLong();
			int checkI =-1;
			int checkJ =-1;
			for(int i=0; i<users.length;i++) {
				for(int j=0; j<users[i].accCount;j++) {
					if(users[i].acc[j].bank.code.equals(code)&&users[i].acc[j].account == transferAcc) {
						checkI = i;
						checkJ = j;
					}
				}
			}
			if(checkI != -1) {
				while(true) {
					int fee =0;
					if(users[checkI].acc[checkJ].bank.code.equals(users[log].acc[accSel].bank.code)) {
						System.out.println("당행이체시 십만원 이하에는 수수료가 없고,");
						System.out.println("십만원 이상에는 수수료가 1000원 발생합니다.");
					}else {
						System.out.println("타행이체시 십만원 이하에는 수수료 500원,");
						System.out.println("십만원 이상에는 수수료가 1500원 발생합니다.");
						fee = 500;
					}
					System.out.println("이체할 금액을 적으세요");
					System.out.print("(종료 0)>");
					int transferMoney = sc.nextInt();
					if(transferMoney >=100000) {
						fee += 1000;
					}
					if(transferMoney == 0) {
						return;
					}else if(transferMoney<0) {
						System.out.println("잘못된 금액입니다.");
					}else if(transferMoney+fee>users[log].acc[accSel].getMoney()){
						System.out.println("잔액 초과입니다.");
					}else {
						users[log].acc[accSel].setMoney(users[log].acc[accSel].getMoney() - transferMoney-fee);
						users[checkI].acc[checkJ].setMoney(users[checkI].acc[checkJ].getMoney() + transferMoney);
						
						System.out.println(users[checkI].name+"님\n["+users[checkI].acc[checkJ].bank.name+":"+
								users[checkI].acc[checkJ].account
								+"] 계좌에,\n"+transferMoney+"원 이체되었습니다.");
						System.out.println("수수료는 "+fee+"원 입니다.");
						System.out.println("잔액은 "+users[log].acc[accSel].getMoney()+"원 입니다.");
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
	
	public String bankCode() {
		while(true) {
			System.out.println("은행 코드를 입력해주세요");
			System.out.print("[기업:03, 농협:11, 우리:20](0.취소)>");
			String code = sc.next();
			for(int i=0; i<banks.length; i++) {
				if(code.equals(banks[i].code)) {
					return code;
				}
			}
			if(code.equals("0")) return code;
			System.out.println("잘못된 코드입니다.");
		}
	}
	public Bank bankSearchByCode(String code) {
		for(int i=0; i<banks.length; i++) {
			if(code.equals(banks[i].code)) {
				return banks[i];
			}
		}
		return null;
	}
	
	@Override 
	public void join() {
		if(log == -1) {
			System.out.println("환영합니다.");
			while(true) {
				System.out.println("사용하실 이름을 적어주세요.");
				System.out.print("(0.취소)>");
				String name = sc.next();
				if(name.equals("0")) break;
				System.out.println("사용하실 ID를 적어주세요.");
				System.out.print("(0.취소)>");
				String id = sc.next();
				if(id.equals("0")) break;
				String pw;
				if(checkId(id)==-1) {
					while(true) {
						System.out.println("사용할 pw를 적어주세요.");
						System.out.print(">");
						pw = sc.next();
						if(pw.contains(id)) {
							System.out.println("id를 포함하여 쓸 수 없습니다.");
						}else if(pw.length()<4) {
							System.out.println("패스워드는 4자 이상으로 적어주세요");
						}
						else {
							break;
						}
					}
					System.out.println("다시한번 pw를 적어주세요.");
					System.out.print(">");
					String pw2 = sc.next();
					if(pw.equals(pw2)) {
						System.out.println("비밀 번호가 확인되었습니다.");
						if(users.length==0) {
							users = new User[users.length+1];
						}else {
							User[] temp = users;
							users = new User[users.length+1];
							for(int i=0; i<users.length-1; i++) {
								users[i] = temp[i];
							}
						}
						users[users.length-1] = new User();
						users[users.length-1].accCount = 0;
						users[users.length-1].id = id;
						users[users.length-1].name = name;
						users[users.length-1].pw = pw;
						break;
					}else {
						System.out.println("비밀 번호가 서로 다릅니다.");
					}
				}else {
					System.out.println("이미 존재하는 아이디입니다.");
				}
			}
			
			
		}else {
			System.out.println("로그아웃 상태에서 사용 가능한 메뉴입니다.");
		}
	}	
	public int checkId(String id) {
		int check = -1;
		for(int i=0; i<users.length;i++) {
			if(users[i].id.equals(id)) {
				check = i;
			}
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
		System.out.println("3.계좌 관리");
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
	
	public void directLogOn() {
		while(true) {
			System.out.println("다이렉트 로그인할 인덱스를 선택하세요");
			System.out.print("(취소 : -1)>");
			int selId = sc.nextInt();
			if(selId>=0 && selId<users.length) {
				log = selId;break;
			}else if(selId == -1) {
				break;
			}else{
				System.out.println("잘못 입력됨.");
			}
		}
	}
}
