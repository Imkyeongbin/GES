package forEx;

public class ForEx2 {

	public static void main(String[] args) {
		int count=0, total=0;
		for(int i=1; i<=100; i++){
			if(i%2==1&&i%3!=0) {
				count++;
				total += i;
			}
		}
		System.out.println("개수:"+count);
		System.out.println("합계:"+total);
	}

}
