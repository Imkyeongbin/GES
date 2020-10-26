package staticex;

public class ShopServiceExam01 {

	public static void main(String[] args) {
		ShopService01 sv1 = ShopService01.getInstance();
		ShopService01 sv2 = new ShopService01();
		if(sv1 == sv2) {
			System.out.println("같은 ShopSerivice 객체 입니다.");
		}else {
			System.out.println("다른 ShopSerivice 객체 입니다.");
		}
	}

}
