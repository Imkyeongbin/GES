package forEx;

public class MultiforEx10 {

	public static void main(String[] args) {
		int cnt = 0;
		for(int k=0; k<=30000/10000;k++) {
			for(int j=0; j<=30000/5000; j++) {
				for(int i=0;i<=30000/1000;i++) {
					if((1000*i+5000*j+10000*k)==30000) {
						System.out.printf("1000원짜리 %d개, 5000원짜리 %d개, 10000원짜리 %d개\n",i,j,k); 
						cnt++;
					}
					
				}
			}
		}
		System.out.println("개수 :"+cnt+"개");
	}

}
