package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("이승우", "010-2222-3333");
		hm.put("손흥민", "010-3333-3333");
		hm.put("전지현", "010-4455-3333");
		System.out.println("이승우 TEL:" + hm.get("이승우"));
		System.out.println("손흥민 TEL:" + hm.get("손흥민"));
		System.out.println("전지현 TEL:" + hm.get("전지현"));
		// 이승우, 손흥민, 전지현
		Set<String> st = hm.keySet();
		for(String str : st) {
			System.out.println(str +"의 전화[Set]-->" +hm.get(str));
		}
		
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+"의 전화" + hm.get(key));
		}
	}

}
