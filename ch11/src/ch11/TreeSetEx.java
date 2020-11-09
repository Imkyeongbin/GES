package ch11;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		while(ts.size()!=6) {
			int num = (int)(Math.random()*45) + 1;
			ts.add(num);
		}
		System.out.println(ts);
	}

}
