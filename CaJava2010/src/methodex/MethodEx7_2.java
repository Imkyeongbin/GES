package methodex;

public class MethodEx7_2 {
	public void disp(char a, int b) {
		for(int i=0; i<b ; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	public void disp(int a, int b, char c) {
		int until = a-b;
		for(int i=0; i< until ; i++) System.out.print(c);
		System.out.println();
	}
	public void disp(char a, char b, int c) {
		for(int i=0; i < c ; i++) {
			if(i%2 == 0) System.out.print(b);
			else System.out.print(a);
		}
		System.out.println();
	}
	public void disp(char a, char b, char c, int d) {
		for(int i=0; i<d ; i++) {
			if(i%3 == 0) System.out.print(a);
			else if(i%3 == 1) System.out.print(b);
			else System.out.print(c);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MethodEx7_2 ms = new MethodEx7_2();
		ms.disp('@', 3);
		ms.disp('#', 5);
		ms.disp('%', 7);
		ms.disp(9, 5, '&');
		ms.disp('@', '#', 7);
		ms.disp('@','#','$', 9);
	}

}
