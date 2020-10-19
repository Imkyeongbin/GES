package whileEx;

import java.util.Scanner;

public class DowhileEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		do {
			System.out.print("단입력 : ");
			i = sc.nextInt();
			// 구구단 출력
		}while(i<2||i>9);
		for(int j=1; j<10; j++) {
			System.out.println(i+"*"+j+"="+j*i);
		}
	}

}
