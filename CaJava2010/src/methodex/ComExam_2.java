package methodex;

public class ComExam_2 {
	
	
	public static void main(String[] args) {
		Com_2 myCom = new Com_2();
		int[] value1 = new int[] {1, 2, 3};
		int result1 = myCom.sum1(value1);
		System.out.println("result1: "+ result1);
		int[] value2 = new int[] {1, 2, 3, 4, 5};
		int result2 = myCom.sum1(value2);
		System.out.println("result2: "+ result2);
	}

}
