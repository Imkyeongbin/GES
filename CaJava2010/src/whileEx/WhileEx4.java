package whileEx;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char yn;
		int score = 0, cnt = 0;
		
		while(true) {
			for(int i=0; i<5; i++) {
				int a = (int)(Math.random()*99)+1;
				int b = (int)(Math.random()*99)+1;
				System.out.print("["+(i+1)+"번 문제]:"+a+"+"+b+"=");
				int ans = sc.nextInt();
				if(ans== a+b) {
					System.out.println("정답입니다.");
					cnt++;
				}else {
					System.out.println("틀렸습니다. "+(a+b)+"입니다.");
				}
			}
			System.out.println("맞은개수:"+cnt);
			score = cnt*20;
			System.out.println("점수:"+score);
			System.out.println("한번 더 하실건가요?(Y,N)");
			yn = sc.next().charAt(0);
			if(yn=='n'||yn=='N') break;
		}
		System.out.println("종료");
	}

}
