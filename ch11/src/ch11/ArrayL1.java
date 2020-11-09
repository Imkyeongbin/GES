package ch11;

import java.util.ArrayList;

public class ArrayL1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("멍멍2");
		a1.add("멍멍3");
		a1.add("멍멍2");
		a1.add("멍멍4");
		a1.add("멍멍3");
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("==========================");
		for(String str : a1) {
			System.out.println(str);
		}
	}

}
