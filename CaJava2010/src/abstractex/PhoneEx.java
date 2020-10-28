package abstractex;

public class PhoneEx {

	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		SmtPhone smtPhone = new SmtPhone("kevin");
		
		smtPhone.turnOn();
		smtPhone.internetSearch();
		smtPhone.turnOff();
	}

}
