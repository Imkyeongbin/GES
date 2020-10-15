package stringEx;

public class StringFormatEx1 {

	public static void main(String[] args) {
		System.out.println("# 위치: 오른쪽 붙임, 왼쪽 붙임");
		System.out.println(String.format("%10s%10s", "JAVA", "PYTHON"));
		System.out.println(String.format("%-10s%-10s", "JAVA", "PYTHON"));
		System.out.println("# 자리수: 10");
		System.out.println(String.format("%d %d", 12345, 67890));
		System.out.println(String.format("%10d %10d", 12345, 67890));
		System.out.println("# 순서 : 2$ 1$");
		System.out.println(String.format("%1$d %2$d", 12345, 67890));
		System.out.println(String.format("%2$d %1$d", 12345, 67890));
		System.out.println("# 정밀도: .숫자");
		System.out.println(String.format("%d %d", 100, 100));
		System.out.println(String.format("%.3f %.5f", 100.12345f ,100.55678f));
		System.out.println(String.format("%.2f %.5f", 100000.89399f, 100000.9999999f));
		
		System.out.println(String.format("%2$10s%1$10s","KOREA", "JAPAN"));
	}

}
