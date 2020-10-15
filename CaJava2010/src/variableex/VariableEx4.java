package variableex;

public class VariableEx4 {

	public static void main(String[] args) {
//형변환
		int num1 = 10;
		int num2 = 20;
		short result = (short)(num1 + num2);  //강제형변환
		System.out.println("형변환 :" + result);
		
		float var1 = 10f;
		double var2 = var1;		//자동형변환
		System.out.println("형변환 :" + var2);
		
		double var3 = 10.5;
		int var4 = (int)var3;		//강제형변환
		System.out.println("형변환 :" + var4);
	}

}
