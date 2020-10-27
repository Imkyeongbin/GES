package classex;

public class ClassStudy {
	int[] score = new int[3];
	int sum;
	double avg;
	public ClassStudy(int a, int b, int c) {
		this.score[0] = a;
		this.score[1] = b;
		this.score[2] = c;
	}
	public int total() {
		this.sum = 0;
		for(int i=0; i<score.length; i++) {
			this.sum += this.score[i];
		}
		return sum;
	}
	public double average() {
		avg = (double)sum/score.length;
		return avg;
	}
	public String pass() {
		return avg>=70 ? "합격" : "불합격";
	}
	public static void main(String[] args) {
		ClassStudy cs = new ClassStudy(47,55,91);
		System.out.println("총점: "+ cs.total());
		System.out.printf("평균: %.2f\n", cs.average());
		System.out.println("당락: " + cs.pass());
	}

}
