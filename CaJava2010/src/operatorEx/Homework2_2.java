package operatorEx;

import java.util.Scanner;

public class Homework2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int value = sc.nextInt();
		value = (value == 999999999 ? 900 : value);
		System.out.println(value);
	}

}
