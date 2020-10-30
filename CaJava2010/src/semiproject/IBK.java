package semiproject;

public class IBK extends Bank{
	
	public IBK() {
		super();
		this.name = "기업은행";
		this.code = "03";
	}

	@Override
	public void introductionBank() {
		System.out.println("참! 좋은 은행");
		System.out.println("IBK기업은행");
	}
}
