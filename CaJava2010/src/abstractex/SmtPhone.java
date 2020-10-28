package abstractex;

public class SmtPhone extends Phone{
	//생성자
	public SmtPhone(String owner) {
		super(owner);	//Phone의 생성자 호출
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
