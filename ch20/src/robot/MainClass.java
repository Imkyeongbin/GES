package robot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("SuperRobot주문, 만들어주세요");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionBasic();
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		System.out.println("--------------------------------------------------------------");
		System.out.println("StandardRobot주문, 만들어주세요");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		System.out.println("--------------------------------------------------------------");
		System.out.println("CheapRobot주문, 만들어주세요");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		System.out.println("--------------------------------------------------------------");
		
	}

}
