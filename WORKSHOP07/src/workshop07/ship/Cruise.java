package workshop07.ship;

public class Cruise extends Ship {

	public Cruise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sail(int dist) {
		// TODO Auto-generated method stub
		super.setFuelTank(getFuelTank() - (13*dist));
	}

	@Override
	public void refuel(int fuel) {
		// TODO Auto-generated method stub
		super.setFuelTank(getFuelTank() + (8*fuel));
	}
	
}
