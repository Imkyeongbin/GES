package programEX2;

import java.util.Scanner;

public class ControlEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] pop = new long[3][2];
		
		while(true) {
			System.out.println("메인 메뉴");
			System.out.println("──────────────────────");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1.인구입력");
			System.out.println("2.인구출력");
			System.out.println("3.종료");
			System.out.println("4.평균수입 입력");
			System.out.println("5.총생산 출력");
			System.out.print(">");
			int select = sc.nextInt();
			if(select == 1) {
				int index = 0;
				System.out.println("인구 입력 (단위: 만명)");
				System.out.println("──────────────────────");
				System.out.println("1000 ~ 3000 사이로 입력하세요");
				while(index<3) {
					System.out.print("세대"+(index+1)+":");
					pop[index][0] = sc.nextInt();
					if(pop[index][0]<1000||pop[index][0]>3000) {
						System.out.println("잘못된 입력입니다. 1000~3000사이로 입력하세요");
						continue;
					}
					index++;
				}
				System.out.println();
			}else if(select == 2) {
				System.out.println("인구 출력 (단위: 만명)");
				System.out.println("──────────────────────");
				int total = 0 ;
				for(int i=0; i<3; i++) {
					System.out.println("세대"+i+" : "+pop[i][0]);
					total+= pop[i][0];
				}
				System.out.println("총인구 : "+total);
				double avg = total/3.0;
				System.out.printf("평균 : %.2f\n", avg);
				System.out.println();
			}
			else if(select == 3) {
				System.out.println("감사합니다!");
				break;
			}
			else if(select == 4) {
				System.out.println("평균 수입 입력 (단위: 만원)");
				System.out.println("──────────────────────");
				for(int i=0; i<3; i++) {
					System.out.print("세대"+(i+1)+":");
					pop[i][1] = sc.nextInt();
				}
			}else if(select == 5) {
				System.out.println("총 생산 출력 (단위: 억원)");
				System.out.println("──────────────────────");
				for(int i=0; i<3; i++) {
					System.out.println("세대"+i+" : " + pop[i][0]*pop[i][1]);
				}
			}
			
			else {
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}
	}

}
