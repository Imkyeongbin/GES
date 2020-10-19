package whileEx;

public class DowhileEx2 {

	public static void main(String[] args) {
		int i=0, sum=0;
		do {
			i++;
			sum+= i;
			System.out.print(i);
			if(i!=10) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
		}while(i<10);
		System.out.println(sum);
	}

}
