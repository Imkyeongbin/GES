package forEx;

public class MultiforEx4 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<6; j++) {
				System.out.print((int)(99*Math.random()+1)+"\t");
			}
			System.out.println();
		}
	}

}
