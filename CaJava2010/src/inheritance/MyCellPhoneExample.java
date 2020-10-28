package inheritance;

public class MyCellPhoneExample {

	public static void main(String[] args) {
		MyCellPhone mcp = new MyCellPhone();
		mcp.setModel("갤럭시");
		mcp.setColor("골드");
		mcp.setChannel("영화");
		System.out.println("모델: "+mcp.model);
		System.out.println("색상: "+mcp.color);
		System.out.println("채널: "+mcp.channel);
		mcp.powerOn();
		mcp.kakaotalk();
		mcp.kakaotalkTalk();
		mcp.kakaotalk();
		mcp.turnYoutube();
		mcp.turnYoutube("음악");
		mcp.turnYoutube();
	}

}
