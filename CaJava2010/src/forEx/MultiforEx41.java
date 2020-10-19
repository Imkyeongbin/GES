package forEx;

public class MultiforEx41 {

	public static void main(String[] args) {
		int arr[][] = new int[10][6];
		for(int i=0; i<10; i++) {
			for(int j=0; j<6; j++) {
				arr[i][j] = (int)(Math.random()*99) + 1;
				for(int k=0; k<j; k++) {
					if(arr[i][j] == arr[i][k]) {
						j--;
					}
				}
			}
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<6; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
