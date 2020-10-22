package methodex;
class Update2 {
	void update(TestMethodEx2 counter) {
		counter.count--;
	}
}
public class TestMethodEx2 {
	int count = 10;
	public static void main(String[] args) {
		TestMethodEx2 myCounter = new TestMethodEx2();
		System.out.println("before update: "+ myCounter.count);
		Update2 myUpdater = new Update2();
		myUpdater.update(myCounter);
		System.out.println("after update: "+ myCounter.count);
	}

}
