package ch11;

import java.util.ArrayList;

public class ArrayL2 {
	public static void print(ArrayList<String> list) {
		for(String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println("\n-----------------------------------------------------");
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("갯수 : " + list.size());
		print(list);
		// 1번 자리에 끼워 넣기 가능하다
		list.add(1,"키위"); // 밀림(삽입)
		print(list);
		list.set(4, "봉숭아");	// 교체
		print(list);
		list.remove(0);
		print(list);
		System.out.println("3번 인덱스 -->" + list.get(3));
		System.out.println("바나나 문의 : " + list.contains("바나나"));
		System.out.println("바나나 문의 : " + list.indexOf("바나나"));
		System.out.println("바나나 문의 : " + list.lastIndexOf("바나나"));
		for(int i=0; i< list.size(); i++) {
			if(list.get(i).equals("바나나")) {
				list.set(i, "딸기");
			}
		}
		print(list);
	}

}
