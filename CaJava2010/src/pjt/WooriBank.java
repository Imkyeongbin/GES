package pjt;

public class WooriBank extends Bank{
	
	public WooriBank() {
		super();
		this.name = "우리은행";
		this.code = "20";
	}

	@Override
	public void introductionBank() {
		System.out.println("우리에게 좋은 일이 생깁니다.");
		System.out.println("우리은행");
	}
}
