package listex;

import java.util.ArrayList;

public class ListEx2 {

	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		System.out.println(pitches.get(1));
		System.out.println(pitches.size());
		System.out.println(pitches.contains("142"));
		System.out.println(pitches.remove(0));
		System.out.println(pitches.remove("142"));
		System.out.println(pitches.size());
		System.out.println(pitches);
		pitches.add("138");
		pitches.add("142");
		System.out.println(pitches);
	}

}
