package elseifEx;

import java.util.Scanner;

public class ElseifEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int coffee[] = {5,5,5};
		while(coffee[0]+coffee[1]+coffee[2]>0) {
			if(coffee[0]>0)System.out.print("1.아메리카노 300 ");
			if(coffee[1]>0)System.out.print("2.카페라떼 500 ");
			if(coffee[2]>0)System.out.print("3.카페모카 600 ");
			System.out.println("커피를 선택해주세요");
			System.out.print(">");
			int select = sc.nextInt()-1;
			int price = 0;
			if(select>=0&&select<=2) {
				if(select == 0 &&coffee[select]>0) {
					System.out.println("아메리카노 선택");
					price = 300;
				}else if(select == 1&&coffee[select]>0) {
					System.out.println("카페라떼 선택");
					price = 500;
				}else if(select == 2&&coffee[select]>0) {
					System.out.println("카페모카 선택");
					price = 600;
				}else System.out.println("잘못된 선택입니다");
				if(coffee[select]>0) {
					System.out.println("돈을 넣어주세요");
					System.out.print(">");
					int money = sc.nextInt();
					if(money<price) {
						System.out.println("돈 부족");
					}else if(price < money) {
						System.out.println("커피 받으시고 잔돈 "+ (money-price)+"원 받으세요");
						coffee[select]--;
					}else {
						System.out.println("커피 받으세요");
						coffee[select]--;
					}
					if(coffee[select]==0)
						System.out.println("커피 재고 소진");
					else
						System.out.println("남은 커피 재고는 "+coffee[select]+"컵입니다.");
				}
			}else {
				System.out.println("잘못된 값입니다.");
			}
			
		}
	}

}
