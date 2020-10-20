package programEX2;

import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		int[] lottoAns = new int[6];
		while(true) {
			for(int i=0; i<lottoAns.length; i++) {
				lottoAns[i] = (int)(Math.random()*99+1);
				for(int j=0; j<i; j++) {
					if(lottoAns[j]== lottoAns[i]) i--;
					if(lottoAns[j]>lottoAns[i]) {
						int temp = lottoAns[j];
						lottoAns[j] = lottoAns[i];
						lottoAns[i] = temp;
					}
				}
			}
//			for(int i=0; i<lottoAns.length; i++) {
//				System.out.print(lottoAns[i]+" ");
//			}
//			System.out.println();
			System.out.println(">> Lotto Program");
			System.out.println("1 ~ 99 사이의 숫자 6개를 입력해 주세요");
			System.out.print(">");
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = sc.nextInt();
				if(lotto[i]>=1&&lotto[i]<100) {
					for(int j=0; j<i; j++) {
						if(lotto[j]== lotto[i]) {
							System.out.println("중복 숫자를 작성했습니다. 다시 입력해주세요.");
							i--;
						}
						if(lotto[j]>lotto[i]) {
							int temp = lotto[j];
							lotto[j] = lotto[i];
							lotto[i] = temp;
						}
					}
				}else {
					System.out.println("범위 내의 숫자를 입력해주세요");
					i--;
				}
			}
			int cnt =0;
			System.out.print("당신이 입력한 숫자는: ");
			for(int i=0 ; i<lotto.length; i++) {
				System.out.print(lotto[i]+" ");
			}
			System.out.print("로또 당첨 번호는 : ");
			for(int i=0 ; i<lottoAns.length; i++) {
				System.out.print(lottoAns[i]+" ");
			}
			System.out.println();
			for(int i=0; i<lotto.length; i++) {
				for(int j=0; j<lotto.length; j++) {
					if(lotto[j] == lottoAns[i]) cnt++;
					
				}
			}
			if(cnt>0&&cnt<6)
				System.out.println(lottoAns.length-cnt+"등 !!!");
			else if(cnt >=6)
				System.out.println("축하합니다! 1등입니다 !!!");
			else
				System.out.println("꽝");
			String yn;
			while(true) {
				System.out.println("계속 진행하시겠습니까? y/n");
				yn = sc.next();
				
				if(yn.equals("n") || yn.equals("N")) break;
				else if(yn.equals("y") || yn.equals("Y")) break;
				else {
					System.out.println("y나 n중의 하나를 선택해주세요.");
				}
			}
			if (yn.equals("n") || yn.equals("N")) break;
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
