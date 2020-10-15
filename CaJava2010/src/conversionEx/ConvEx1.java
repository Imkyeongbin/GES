package conversionEx;

public class ConvEx1 {

	public static void main(String[] args) {
		int bNum = 10;
		byte num = (byte)bNum;
		System.out.println(num);
		
		float lNum = 10; //덜 정밀한 수 -> 더 정밀한 수
		long fNum = (long)lNum;
		System.out.println(fNum);
		
		double dNum = fNum + num;
		System.out.println(dNum);
	}

}
