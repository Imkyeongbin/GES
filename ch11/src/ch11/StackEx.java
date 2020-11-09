package ch11;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		String[] pet = {"지렁이", "굼벵이", "애벌레", "구렁이"};
		Stack<String> st = new Stack<String>();
		for(String str : pet) {
			System.out.println("push 넣음-->"+str);
			st.push(str);
		}
		System.out.println("----------pop 꺼냄-----------");
		while(!st.isEmpty()) {
			System.out.println("POP->"+st.pop());
		}
	}

}
