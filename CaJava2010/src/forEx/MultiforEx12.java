package forEx;

import java.util.Scanner;

public class MultiforEx12 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력하시오(홀수,양수)");
			n = sc.nextInt();
			if(n%2 == 0 || n<=0) {
				System.out.println("홀수만 입력해주세요(양수입력해주세요)");
			}else {
				break;
			}
		}
		int i, j= 0;
		int star = 0;
		for(i=0; i<n;i++) {
			if(i<=n/2) {
				for(j=0; j< n/2-i; j++) {
					System.out.print("  ");
				}
				for(j=0; j<2*i+1; j++) {
					System.out.print(" *");
					star++;
				}
			}
			else {
				for(j=0; j< i- n/2; j++) {
					System.out.print("  ");
				}
				for(j=0; j<2*n-2*i-1; j++) {
					System.out.print(" *");
					star++;
				}
			}
			System.out.println();
		}
		System.out.println("별 갯수 : "+star);
	}

}
