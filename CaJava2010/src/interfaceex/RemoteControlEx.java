package interfaceex;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteCon rc1 = new Television();
		rc1.turnOn();
//		rc1.setVolume(10);
		rc1.setMute(true);
		rc1.turnOff();
		
		RemoteCon rc2 = new Audio();
		rc2.turnOn();
		rc2.setMute(false);
		rc2.turnOff();
		RemoteCon.changeBattery();
	}

}
