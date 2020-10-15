package programEX;

public class PopPrintEx1 {

	public static void main(String[] args) {
		int pop1 = 1050, pop2 = 1060, pop3 = 1080;
		System.out.println("인구 출력");
		System.out.println("──────────────────────");
		System.out.println("\t세대1 : " + pop1);
		System.out.println("\t세대2 : " + pop2);
		System.out.println("\t세대3 : " + pop3);
		int total = pop1 + pop2 + pop3;
		double avg = total/3.0;
		System.out.println("\t총인구 : "+total);
		System.out.printf("\t평   균 : %.2f", avg);
		System.out.println();
		System.out.println("──────────────────────");
	}

}
