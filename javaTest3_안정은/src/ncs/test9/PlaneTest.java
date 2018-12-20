package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {
		// 문제 9.
		Plane pp = null;
		
		Plane p1 = new AirPlane("L747", 1000);
		Plane p2 = new Corgoplane("C40", 1000);
		
		System.out.println("Plane  fuelSize");
		System.out.println("----------------");
		System.out.println(p1.getPlaneName() + "     " + p1.getFuelSize());
		System.out.println(p2.getPlaneName() + "      " + p2.getFuelSize());
		p1.flight(100);
		p2.flight(100);
		System.out.println("100 운항");
		System.out.println("Plane  fuelSize");
		System.out.println("----------------");
		System.out.println(p1.getPlaneName() + "     " + p1.getFuelSize());
		System.out.println(p2.getPlaneName() + "      " + p2.getFuelSize());
		p1.refuel(200);
		p2.refuel(200);
		System.out.println("200 주유");
		System.out.println("Plane  fuelSize");
		System.out.println("----------------");
		System.out.println(p1.getPlaneName() + "     " + p1.getFuelSize());
		System.out.println(p2.getPlaneName() + "      " + p2.getFuelSize());
		
		/*System.out.println("----------------");
		pp = new AirPlane("L747", 1000);
		System.out.println(pp.getPlaneName()+" "+pp.getFuelSize());
		pp.flight(100);
		System.out.println(pp.getPlaneName()+" "+pp.getFuelSize());
		pp = new Corgoplane("C40", 1000);
		System.out.println(pp.getPlaneName()+" "+pp.getFuelSize());
		pp.flight(100);
		System.out.println(pp.getPlaneName()+" "+pp.getFuelSize());*/

	}

}
