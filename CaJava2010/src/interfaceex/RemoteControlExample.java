package interfaceex;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision(); 
		
		stv.turnOn();
		stv.turnOn();
		stv.setVolume(10);
		stv.setMute(true);
		stv.turnOff();
		stv.search("http://naver.com");
		stv.wifiOn();
		stv.changeCh(7);
		stv.wifiOff();
		stv.changeVOD("영화");
		stv.netflixOn();
		stv.netflixOff();
		stv.youtubeOn();
		stv.youtubeOff();
	}

}
