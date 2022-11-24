package workshop07.ship;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boat boat = new Boat("Boat01", 500);
		Cruise cruise = new Cruise("Cruise", 1000);

		ArrayList<Ship> shipList = new ArrayList<>();

		shipList.add(boat);
		shipList.add(cruise);

		System.out.println("shipName\tfuelTank");
		System.out.println("-------------------------");

		for (int i = 0; i < shipList.size(); i++) {
			Ship ship = shipList.get(i);
			System.out.println(ship.getShipName() + "\t" + ship.getFuelTank());
		}
		
		System.out.println();
		
		System.out.println("Boat는 10, Cruise는 15 주행");
		System.out.println("shipName\tfuelTank");
		System.out.println("-------------------------");
		for (int i = 0; i < shipList.size(); i++) {
			Ship ship = shipList.get(i);
			if(ship instanceof Boat) {
				ship.sail(10);
			} else {
				ship.sail(15);
			}
			System.out.println(ship.getShipName() + "\t" + ship.getFuelTank());
		}
		
		System.out.println();
		
		System.out.println("Boat는 20, Cruise는 30 주유");
		System.out.println("shipName\tfuelTank");
		System.out.println("-------------------------");
		for (int i = 0; i < shipList.size(); i++) {
			Ship ship = shipList.get(i);
			if(ship instanceof Boat) {
				ship.refuel(20);
			} else {
				ship.refuel(30);
			}
			System.out.println(ship.getShipName() + "\t" + ship.getFuelTank());
		}

	}

}
