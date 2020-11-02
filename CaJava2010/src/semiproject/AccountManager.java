package semiproject;

import java.util.Random;

public class AccountManager {
	
	Random ran = new Random();
	public void createAcc() {
		int log = ATMManager.atmM.log;
		int accCount = ATMManager.atmM.users[log].accCount;
		String bankCode;
		int newAcc;
		while(true) {
			if(ATMManager.atmM.users[log].accCount<3) {
				System.out.println("[계좌 생성]");
				bankCode = ATMManager.atmM.bankCode();
				if(bankCode.equals("0")) {
					break;
				}
				while(true) {
					System.out.println("추천하실 아이디가 있으면 본인과 추천받으신 분 두 분께 1000원 이하의 랜덤한 보너스가 지급됩니다.");
					System.out.println("추천 아이디가 있습니까?");
					System.out.print("(y/n)>");
					String yn = ATMManager.sc.next();
					if(yn.equals("Y")||yn.equals("y")) {
						System.out.println("아이디를 적어주십시오.");
						System.out.print("(뒤로 가기: 0)>");
						String recommendId = ATMManager.sc.next();
						if (recommendId.equals("0")) break;
						int bonusIdx = ATMManager.atmM.checkId(recommendId);
						if(bonusIdx!= -1) {
							int bonusMoney = ran.nextInt(1000)+1;
							newAcc = ran.nextInt(999999999)+10000;
							if(ATMManager.atmM.users[bonusIdx].accCount!= 0) {
								ATMManager.atmM.users[bonusIdx].acc[0].setMoney(ATMManager.atmM.users[bonusIdx].acc[0].getMoney()+bonusMoney);
								System.out.println(ATMManager.atmM.users[bonusIdx].name+"님의 첫번째 계좌에 "+bonusMoney+"원 입금되었습니다.");
							}else {
								System.out.println("계좌가 없으므로 본인의 계좌에만 보너스가 지급됩니다.");
							}
							ATMManager.atmM.users[log].accCount++;
							ATMManager.atmM.users[log].acc[accCount] = new Account();
							ATMManager.atmM.users[log].acc[accCount].account = newAcc;
							ATMManager.atmM.users[log].acc[accCount].bank = ATMManager.atmM.banks[ATMManager.atmM.accBankCheck(bankCode)];
							ATMManager.atmM.users[log].acc[accCount].setMoney(ATMManager.atmM.users[log].acc[accCount].getMoney()+bonusMoney);
							System.out.println("당신의 새 계좌는 "+ATMManager.atmM.users[log].acc[accCount].bank.name+":"
									+ATMManager.atmM.users[log].acc[accCount].account+"입니다.");
							accCount++;
						}else {
							System.out.println("없는 아이디입니다.");
						}
					}else if(yn.equals("N")||yn.equals("n")){
						newAcc = ran.nextInt(999999999)+10000;
						ATMManager.atmM.users[log].accCount++;
						ATMManager.atmM.users[log].acc[accCount] = new Account();
						ATMManager.atmM.users[log].acc[accCount].account = newAcc;
						ATMManager.atmM.users[log].acc[accCount].bank = ATMManager.atmM.banks[ATMManager.atmM.accBankCheck(bankCode)];
						ATMManager.atmM.users[log].acc[accCount].setMoney(ATMManager.atmM.users[log].acc[accCount].getMoney());
						System.out.println("당신의 새 계좌는 "+ATMManager.atmM.users[log].acc[accCount].bank.name+":"
						+ATMManager.atmM.users[log].acc[accCount].account+"입니다.");
						accCount++;
						break;
					}else {
						System.out.println("잘못된 입력입니다.");
					}
				}
			}else {
				System.out.println("계좌는 3개까지 만들 수 있습니다.");
				break;
			}
		}
	}
	

	public void deleteAcc() {
		
	}

	public void checkAcc() {
		
	}
	
}
