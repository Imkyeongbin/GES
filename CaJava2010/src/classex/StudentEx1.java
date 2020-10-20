package classex;

import classex.StudentEx2;

public class StudentEx1 {

	public static void main(String[] args) {
		StudentEx2 studentHong = new StudentEx2();
		studentHong.studentName = "홍길동";
		studentHong.address = "서울시 마포구 대흥동";
		
		studentHong.showStudentInfor();
	}

}
