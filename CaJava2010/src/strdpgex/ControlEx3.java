package strdpgex;

import java.util.Scanner;

public class ControlEx3 {
	static public int mainMenu() {
		Scanner sc = new Scanner(System.in);
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
		return select;
	}
	static public void inputPop(long[][] pop) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		System.out.println("인구 입력 (단위: 만명)");
		System.out.println("──────────────────────");
		System.out.println("1000 ~ 3000 사이로 입력하세요");
		while (index < 3) {
			System.out.print("세대" + (index + 1) + ":");
			pop[index][0] = sc.nextInt();
			if (pop[index][0] < 1000 || pop[index][0] > 3000) {
				System.out.println("잘못된 입력입니다. 1000~3000사이로 입력하세요");
				continue;
			}
			index++;
		}
		System.out.println();
	}
	static public void outputPop(long[][] pop) {
		System.out.println("인구 출력 (단위: 만명)");
		System.out.println("──────────────────────");
		int total = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("세대" + i + " : " + pop[i][0]);
			total += pop[i][0];
		}
		System.out.println("총인구 : " + total);
		double avg = total / 3.0;
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println();
	}
	static public void inputIncome(long[][] pop) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균 수입 입력 (단위: 만원)");
		System.out.println("──────────────────────");
		for (int i = 0; i < 3; i++) {
			System.out.print("세대" + (i + 1) + ":");
			pop[i][1] = sc.nextInt();
		}
	}
	static public void outputGDP(long[][] pop) {
		System.out.println("총 생산 출력 (단위: 억원)");
		System.out.println("──────────────────────");
		for (int i = 0; i < 3; i++) {
			System.out.println("세대" + i + " : " + pop[i][0] * pop[i][1]);
		}
	}
	public static void main(String[] args) {
		long[][] pop = new long[3][2];
		종료 : while (true) {
			int select = mainMenu();
			switch (select) {
			case 1: 
				inputPop(pop);
				break;
			case 2: 
				outputPop(pop);
				break;
			case 3: 
				break 종료;
			case 4: 
				inputIncome(pop);
				break;
			case 5: 
				outputGDP(pop);
				break;
			default: 
				System.out.println("잘못된 메뉴 선택입니다.");
			
			}
		}
		System.out.println("감사합니다!");
	}

}
