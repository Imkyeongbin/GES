package robot;

import robot.actions.FireAction;
import robot.actions.FlyAction;
import robot.actions.KnifeAction;

public abstract class Robot {
	public FlyAction flyAction;
	public FireAction fireAction;
	// public String kkk;
	public KnifeAction knifeAction;
	
	
	public FlyAction getFlyAction() {
		return flyAction;
	}

	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public FireAction getFireAction() {
		return fireAction;
	}

	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}
	
	
	public Robot() {
		
	}
	
	public abstract void shape();
	
	public void actionFly() {
		flyAction.fly();
	}
	public void actionFire() {
		fireAction.Fire();
	}
	public void actionBasic() {
		System.out.println("팔,다리,몸통 보유");
	}
	public void actionKnife() {
		knifeAction.knife();
	}

	
}
