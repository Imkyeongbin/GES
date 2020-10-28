package inheritance;

public class MyCellPhone extends CellPhone{
	boolean youtube = false;
	public void turnYoutube() {
		if(!youtube) {
			System.out.println("유투브 "+this.channel+"를 시작합니다.");
		}else {
			System.out.println("유투브 시청을 멈춥니다.");
		}
		youtube = !youtube;
	}
	public void turnYoutube(String channel) {
		System.out.println("유투브 "+channel+"으로 바꿉니다.");
	}
}
