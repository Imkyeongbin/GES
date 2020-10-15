package arrayEx;

public class ArrayEx04 {

	public static void main(String[] args) {
		double[] arr2 = new double[3];
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		arr2 = new double[] {0.1, 0.2, 0.3};
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		arr3 = new String[] {"1월", "2월", "3월"};
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
	}

}
