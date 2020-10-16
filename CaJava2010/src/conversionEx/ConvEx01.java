package conversionEx;

public class ConvEx01 {

	public static void main(String[] args) {
		float f1 = 10.5f;
		int i1 = 10;
		float f2 = f1/3;
		int i2 = i1/3;
		System.out.println(f2);
		System.out.println(i2);
		
		long l1 = 10;
		long i3 = l1/i2;
		System.out.println(i3);
		
		double f3 = f2 / 3;
		System.out.printf("%.2f",f3);
	}

}
