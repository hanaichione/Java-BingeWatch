package mobile;

public class Ltab extends Mobile {

	public Ltab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize()-(time*10));
		return getBatterySize();
	}
	
	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize()+(time*10));
		return getBatterySize();
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
