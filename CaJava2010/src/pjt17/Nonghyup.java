package pjt17;

public class Nonghyup extends Bank{
	
	
	public Nonghyup() {
		super();
		this.name = "농협은행";
		this.code = "11";
	}

	@Override
	public void introductionBank() {
		System.out.println("함께하는 100년 농협");
	}
}
