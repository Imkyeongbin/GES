package listex;

import java.util.ArrayList;

public class GenericsEx1 {
	public static void main(String[] args) {
		ArrayList<String> aList
		= new ArrayList<String>();
		aList.add("hello");
		aList.add("java");
		String hello = aList.get(0);
		String java = aList.get(1);
		System.out.println(hello);
		System.out.println(java);
	}
}
