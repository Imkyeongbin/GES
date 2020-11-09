package ch11;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("이승우", "010-2222-3333");
		ht.put("손흥민", "010-3333-3333");
		ht.put("전지현", "010-4455-3333");
		System.out.println("이승우 TEL:" + ht.get("이승우"));
		System.out.println("손흥민 TEL:" + ht.get("손흥민"));
		System.out.println("전지현 TEL:" + ht.get("전지현"));
	}

}
