package methodex;

import java.util.Scanner;

public class InstanceMem {
	int a, b;
	
	public InstanceMem(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum(int a, int b) {
		int sum = 0;
		if(a<b) {
			for(int i=a; i<=b; i++) {
				sum+= i;
			}
		}else {
			for(int i=b; i<=a; i++) {
				sum+=i;
			}
		}
		System.out.println("누적 합은 "+ sum + "입니다.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수를 적으시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		InstanceMem myInstance = new InstanceMem(a,b);
		myInstance.sum(myInstance.a, myInstance.b);
	}

}
