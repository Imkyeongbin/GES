package forEx;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		Random ran = new Random();
		for(int i=0; i<6; i++) {
			System.out.print((ran.nextInt(99)+1)+" ");
		}
	}

}
