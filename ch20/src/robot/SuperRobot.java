package robot;

import robot.actions.FireOk;
import robot.actions.FlyOk;
import robot.actions.KnifeWithLaser;

public class SuperRobot extends Robot {

	public SuperRobot() {
		flyAction = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeWithLaser();
	}
	@Override
	public void shape() {
		System.out.println("미사일, 비행");
	}

}
