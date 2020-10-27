package methodex;

public class Car1 {
	private int speed;
	private boolean stop;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else if(speed==0){
			this.speed = speed;
			this.stop = true;
		}else{
			this.speed = speed;
			this.stop = false;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		if(stop) this.speed = 0;
		this.stop = stop;
	}
}
