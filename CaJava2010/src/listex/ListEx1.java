package listex;

import java.util.ArrayList;

public class ListEx1 {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add("hello");
		aList.add("java");
		String hello = (String) aList.get(0);
		String java = (String) aList.get(1);
		System.out.println(hello);
		System.out.println(java);
	}

}
