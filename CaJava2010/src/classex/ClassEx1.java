package classex;

public class ClassEx1 {
	int height;
	int weight;
	int vision;
	String gender;
	int age;
	String address;
	String nation;
	int schoolingTime;
	String name;
	boolean playingGame;
	
	public void showStudentInfo() {
		System.out.println(name + "("+age+") 성별 : "+gender+ " "+ address);
		System.out.println("키 :"+height+" 몸무게 :"+weight+", 시력 :"+ vision);
		System.out.println("국적 : "+ nation +"통학시간 : "+schoolingTime +"게임 플레이 유무 :"+ playingGame);
	}
}
