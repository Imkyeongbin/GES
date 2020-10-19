package whileEx;

public class DowhileEx21 {

	public static void main(String[] args) {
		int i=10, sum=0;
		do {
			
			sum+= i;
			System.out.print(i);
			if(i!=1) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			i--;
		}while(i>0);
		System.out.println(sum);


	}

}
