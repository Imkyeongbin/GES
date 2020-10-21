package classex;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1.name +" Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		s2.name = "김길동";
		System.out.println(s2.name + " 또 다른 Student 객체를 참조합니다.");
	}

}
