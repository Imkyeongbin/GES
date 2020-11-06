package robot;

import robot.actions.FireNo;
import robot.actions.FireOk;
import robot.actions.FlyNo;
import robot.actions.KnifeNo;

public class CheapRobot extends Robot {
	
	public CheapRobot() {
		flyAction = new FlyNo();
		fireAction = new FireOk();
		// kkk = "내가 값 할당";
		knifeAction = new KnifeNo();
	}
	@Override
	public void shape() {
		System.out.println("걷고, 달림..");
	}

}
