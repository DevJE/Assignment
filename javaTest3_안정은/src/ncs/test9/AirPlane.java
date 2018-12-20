package ncs.test9;

public class AirPlane extends Plane{
	public AirPlane() {}
	public AirPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	@Override
	public void flight(int distance) {
		//10운항시 30감소
		//(distace/10*30)
		super.setFuelSize(super.getFuelSize()-distance/10*30);
	}

}
