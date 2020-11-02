package inheritancearr;

public class KTire extends Tire{
	
	public KTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KTire 수명: "
		+ (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location
					+ " KTire 펑크 ***");
			return false;
		}
	}
}
