package elseifEx;

import java.util.Scanner;

public class ElseifEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("네개의 정수를 입력하세요:");
		System.out.print(">");
		a = sc.nextInt();
		System.out.print(">");
		b = sc.nextInt();
		System.out.print(">");
		c = sc.nextInt();
		System.out.print(">");
		d = sc.nextInt();
		int max = a;
		if (b>max) max = b;
		if (c>max) max = c;
		if (d>max) max = d;
		System.out.println();
		System.out.println("큰 수: "+max);
	}

}
