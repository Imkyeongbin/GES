package whileEx;

import java.util.Scanner;

public class DowhileEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char yn;
		do {
			int cnt = 0, sum =0, problemCnt =5;
			System.out.print("몇 문제를 푸시겠습니까? : ");
			problemCnt = sc.nextInt();
			for(int i=0; i<problemCnt; i++) {
				int a = (int)(Math.random()*100)+1;
				int b = (int)(Math.random()*100)+1;
				System.out.print("["+(i+1)+"번 문제]:"+ a+"+"+b+"=");
				int answer = sc.nextInt();
				if(answer == a+b) {
					cnt++; sum = cnt*20;
					System.out.println("정답입니다");
				}else {
					System.out.println("오답입니다"+ (a+b)+"입니다.");
				}
			}
			
			System.out.println("맞은개수 :"+cnt);
			System.out.println("점수 :"+sum);
			
			System.out.println("한번 더 하실건가요?(Y,N)");
			yn = sc.next().charAt(0);
		}while(yn =='y'||yn == 'Y');
		System.out.println("종료");
	}

}
