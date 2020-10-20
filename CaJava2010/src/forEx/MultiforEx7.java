package forEx;

public class MultiforEx7 {

	public static void main(String[] args) {
		for(int i=0;i<9;i+=2) {
			for(int j=i/2; j<4; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
