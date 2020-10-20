package continueEx;

public class ContinueEx011 {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			if(i>99) break;
			i++;
			if(i%3==0&&i%5==0) continue;
			System.out.println(i);
		}
	}

}
