package robot;

import robot.actions.FireOk;
import robot.actions.FlyNo;
import robot.actions.KnifeWithWood;

public class StandardRobot extends Robot {

	public StandardRobot() {
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeWithWood();
	}
	@Override
	public void shape() {
		System.out.println("걷고, 달림, 미사일");
	}

}
