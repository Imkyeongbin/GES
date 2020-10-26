package staticex;

public class CalcuEx01 {

	public static void main(String[] args) {
		String r1 = Calcu01.name+"park";
		double r2 = Calcu01.income(1000000, 5000000);
		double r3 = Calcu01.expense(2000000, 1500000);
		double r4 = r2 - r3;
		System.out.println("성 명 : "+r1);
		System.out.printf("수 입:%.2f\n",r2);
		System.out.printf("지 출:%.2f\n",r3);
		System.out.printf("저 축:%.2f\n",r4);
	}

}
