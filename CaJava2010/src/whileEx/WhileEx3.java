package whileEx;

import java.util.Random;
import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int cnt=0;
		int ans = ran.nextInt(9);
		while(true) {
			System.out.print("숫자 맞추기(0~9): ");
			int num = sc.nextInt();
			cnt++;
			if(num>9||num<0) {
				System.out.println("잘못된 숫자입니다.");
				cnt--;
			}
			else if(num>ans) System.out.println("크다");
			else if(num<ans) System.out.println("작다");
			else break;
		}
		System.out.println(cnt+"번만에 맞추셨습니다.");
	}

}
