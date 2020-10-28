package inheritance;

public class Car001Ex {

	public static void main(String[] args) {
		BenzE300 e300 = new BenzE300();
		e300.setName("Benz E300");
		e300.setFuelEfficiency(9.6);
		e300.setAirConditioning(true);
		e300.setBlockOuterAir(true);
		e300.setChildLock(true);
		e300.setControlSteeringWheel(true);
		e300.setPreventFogging(true);
		e300.setShiftLock(true);
		e300.setVdc(true);
		e300.setPrice(6350);
		System.out.println("차 모델 : "+e300.name);
		System.out.println("연비 : "+e300.fuelEfficiency);
		System.out.println("에어컨디셔닝 : "+e300.airConditioning);
		System.out.println("외부공기 유입 차단 : "+e300.blockOuterAir);
		System.out.println("차일드락 : "+e300.childLock);
		System.out.println("핸들 조절 레버 : "+e300.controlSteeringWheel);
		System.out.println("김 서림 방지 : "+e300.preventFogging);
		System.out.println("쉬프트 락 : "+e300.shiftLock);
		System.out.println("미끄러짐 방지 : "+e300.preventFogging);
		e300.aroundView();
		e300.lcdController();
		e300.multibeamHeadLight();
		System.out.println("가격 : "+e300.price+"만원");
		System.out.println();
		
		BMW_X3 x3 = new BMW_X3();
		x3.setName("BMW X3");
		x3.setFuelEfficiency(8.7);
		x3.setAirConditioning(true);
		x3.setBlockOuterAir(true);
		x3.setChildLock(true);
		x3.setControlSteeringWheel(true);
		x3.setPreventFogging(true);
		x3.setShiftLock(true);
		x3.setVdc(true);
		x3.setPrice(6260);
		System.out.println("차 모델 : "+x3.name);
		System.out.println("연비 : "+x3.fuelEfficiency);
		System.out.println("에어컨디셔닝 : "+x3.airConditioning);
		System.out.println("외부공기 유입 차단 : "+x3.blockOuterAir);
		System.out.println("차일드락 : "+x3.childLock);
		System.out.println("핸들 조절 레버 : "+x3.controlSteeringWheel);
		System.out.println("김 서림 방지 : "+x3.preventFogging);
		System.out.println("쉬프트 락 : "+x3.shiftLock);
		System.out.println("미끄러짐 방지 : "+x3.preventFogging);
		x3.dsc();
		x3.entertainmentSource();
		x3.seetMemory();
		System.out.println("가격 : "+x3.price+"만원");
		System.out.println();
		
		TeslaModel3 model3 = new TeslaModel3();
		model3.setName("Model 3");
		model3.setFuelEfficiency(8.6);
		model3.setAirConditioning(true);
		model3.setBlockOuterAir(true);
		model3.setChildLock(true);
		model3.setControlSteeringWheel(true);
		model3.setPreventFogging(true);
		model3.setShiftLock(true);
		model3.setVdc(true);
		model3.setPrice(5369);
		System.out.println("차 모델 : "+model3.name);
		System.out.println("연비 : "+model3.fuelEfficiency);
		System.out.println("에어컨디셔닝 : "+model3.airConditioning);
		System.out.println("외부공기 유입 차단 : "+model3.blockOuterAir);
		System.out.println("차일드락 : "+model3.childLock);
		System.out.println("핸들 조절 레버 : "+model3.controlSteeringWheel);
		System.out.println("김 서림 방지 : "+model3.preventFogging);
		System.out.println("쉬프트 락 : "+model3.shiftLock);
		System.out.println("미끄러짐 방지 : "+model3.preventFogging);
		model3.autoPilot();
		model3.inchTablet(15);
		model3.internetRadio();
		System.out.println("가격 : "+model3.price+"만원");
	}

}
