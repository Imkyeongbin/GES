package staticex;

public class ShopService01 {
	private static ShopService01 ss = new ShopService01();
	public ShopService01() {
		
	}
	static ShopService01 getInstance() {
		return ss;
	}
}
