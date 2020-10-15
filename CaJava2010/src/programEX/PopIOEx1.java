package programEX;

import java.util.Scanner;

public class PopIOEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인구 입력");
		System.out.println("─────────");
		System.out.print("세대1> ");
		int gen1 = sc.nextInt();
		System.out.print("세대2> ");
		int gen2 = sc.nextInt();
		System.out.print("세대3> ");
		int gen3 = sc.nextInt();
		int sum = gen1 + gen2 + gen3;
		double avg = sum/3.0;
		System.out.println();
		
		System.out.println("인구 출력");
		System.out.println("────────────────────────────");
		System.out.println("\t세대1\t: "+ gen1);
		System.out.println("\t세대2\t: "+ gen2);
		System.out.println("\t세대3\t: "+ gen3);
		System.out.println("\t총인구\t: "+ sum);
		System.out.printf("\t평  균\t: %.2f", avg);
		System.out.println();
		System.out.println("────────────────────────────");
	}

}
