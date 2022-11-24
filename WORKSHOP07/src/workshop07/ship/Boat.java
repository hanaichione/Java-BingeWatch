package workshop07.ship;

public class Boat extends Ship {

	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sail(int dist) {
		// TODO Auto-generated method stub
		super.setFuelTank(super.getFuelTank() - (dist*10));
	}

	@Override
	public void refuel(int fuel) {
		// TODO Auto-generated method stub
		super.setFuelTank(super.getFuelTank() + (fuel*10));
	}
	
}
