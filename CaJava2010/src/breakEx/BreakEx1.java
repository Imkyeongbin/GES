package breakEx;

public class BreakEx1 {

	public static void main(String[] args) {
		int i=0;
		while(i<11) {
			System.out.println(i);
			i++;
			if(i>=6) {
				break;
			}
		}
	}

}
