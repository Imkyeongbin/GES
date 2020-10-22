package methodex;

public class ComExam {
	
	
	public static void main(String[] args) {
		Com myCom = new Com();
		int[] values1 = {1, 2, 3};
		int[] values2 = {1, 2, 3, 4, 5};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		int result2 = myCom.sum1(values2);
		System.out.println("result2: "+ result2);
		
	}

}
