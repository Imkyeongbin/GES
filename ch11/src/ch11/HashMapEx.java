package ch11;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("이승우", "010-2222-3333");
		hm.put("손흥민", "010-3333-3333");
		hm.put("전지현", "010-4455-3333");
		hm.put("전지현", "010-1234-5678");
		hm.put("전지현3", "010-1234-5678");
		System.out.println("이승우 TEL:" + hm.get("이승우"));
		System.out.println("손흥민 TEL:" + hm.get("손흥민"));
		System.out.println("전지현 TEL:" + hm.get("전지현"));
		System.out.println("전지현3 TEL:" + hm.get("전지현3"));
	}

}
