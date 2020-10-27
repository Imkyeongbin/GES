package classex;

public class EncapEx3 {

	public static void main(String[] args) {
		Encap3 ec = new Encap3();
		System.out.println(ec.age);
		System.out.println(ec.month);
//		System.out.println(ec.date); 
		System.out.println(ec.year);
//		System.out.println(ec.nation);
		
//		ec.printNation();
		System.out.println(ec.getDate());
		ec.day();
//		System.out.println(ec.yearAge(2018));
		System.out.println(ec.getNation());
	}

}
