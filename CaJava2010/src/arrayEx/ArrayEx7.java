package arrayEx;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[][] m = new int[3][];
		m[0] = new int[3];
		m[1] = new int[4];
		m[2] = new int[3];
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d\n",i,j,m[i][j]);
			}
		}
	}

}
