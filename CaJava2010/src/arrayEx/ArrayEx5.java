package arrayEx;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[][] m = {{10, 20, 30}, {30, 40, 70, 80}, {50, 60, 90}};
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.printf("m[%d][%d]:%d\n", i, j, m[i][j]);
			}
			System.out.println();
		}
	}

}
