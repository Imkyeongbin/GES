package inheritanceex;

public class HTire extends Tire{
	
	
	public HTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HTire 수명: "
		+ (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location
					+ " HTire 펑크 ***");
			return false;
		}
	}
}
