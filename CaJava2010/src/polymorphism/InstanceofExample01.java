package polymorphism;

public class InstanceofExample01 {
	public static void method1(Parent01 parent) {
		if(parent instanceof Child01) {
			Child01 child = (Child01) parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent01 parent) {
		Child01 child = (Child01)parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent01 parentA = new Child01();
		method1(parentA);
		method2(parentA);
		
		Parent01 parentB = new Parent01();
		method1(parentB);
		method2(parentB); //예외 발생
	}
	
}
