package breakEx;

public class BreakEx2 {

	public static void main(String[] args) {
		int i=0, sum = 0;
		while(true) {
			i++;
			sum+=i;
			if(sum >=2000) break;
		}
		System.out.println("수 : "+i + "\t합 : "+sum);
	}

}
