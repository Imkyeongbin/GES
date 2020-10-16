package ifelseex;

public class IfelseEx3 {

	public static void main(String[] args) {
		int a[] = {2008, 1900, 2000, 2015};
		for(int i : a) {
			System.out.println(i + "년은 ");
			if(i%4==0&&!(i%100==0)||(i%400==0)) {
				System.out.println("윤년");
			}else {
				System.out.println("평년");
			}
		}
	}

}
