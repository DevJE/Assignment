package ncs.test9;

public class Corgoplane extends Plane{
	public Corgoplane() {}
	
	public Corgoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	@Override
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize()-distance/10*50);
	}

}
