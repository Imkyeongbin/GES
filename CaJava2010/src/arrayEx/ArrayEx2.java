// 로또 조합(1~99 6개 숫자) 10조합 출력
// Random 클래스 : 난수를 생성하는 클래스로 객체를 생성하여 사용

package arrayEx;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx2 {

	public static void main(String[] args) {
		for(int k=0; k<10; k++) {
			int m[] = new int[6];
			Random r = new Random();
			for(int i=0; i<m.length ; i++) {
				m[i] = r.nextInt(99) +1; // 1~99 사이의 값
				for(int j=0; j<i; j++) {
					if(m[i] == m[j]) i--;
				}
			}
			Arrays.sort(m);
			for(int i=0 ; i< m.length ; i++) {
				System.out.print(m[i]+"\t");
			}
			System.out.println();
		}
	}

}
