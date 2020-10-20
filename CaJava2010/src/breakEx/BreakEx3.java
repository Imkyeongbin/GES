package breakEx;

public class BreakEx3 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			if(i>3) break;
			for(int j=0; j<5; j++) {
				System.out.print(i+","+j+"\t");
			}
			System.out.println();
		}
	}

}
