package constantex;

public class Constant01 {
	static final double e = 2.71828;
	static final double h = 6.626;
	static final long c = 299792458;
	static final long energy;
	static final double solution;
	static final double photonEnergy;
	static {
		
		energy= c*c;
		solution = e*(1-0);
		photonEnergy = h*1000;
	}
	public static void main(String[] args) {
		System.out.println(h); // 플랑크 상수*10^-34 J*s
		System.out.println(photonEnergy); // 진동수 1000인 광자의 에너지 * 10^-34 J*s
		System.out.println(c);// 빛의 속도 m/s
		System.out.println(energy);// 질량 1kg당 에너지 kg (m/s)^2
		System.out.println(e);//자연상수
		System.out.println(solution); // e^x의 (0부터 1까지의 적분)

	}

}
