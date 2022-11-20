package com.car;

public class L3 extends Car implements Temp {

	public L3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public L3(String name, int engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTempGage() {
		// TODO Auto-generated method stub
		return getDistance()/10;
	}

	@Override
	public void go(int distance) {
		// TODO Auto-generated method stub
		setOilSize(getOilSize()-(distance/10));
		setDistance(distance);
	}

	@Override
	public void setOil(int oilSize) {
		// TODO Auto-generated method stub
		setOilSize(getOilSize()+oilSize);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t\t"+getTempGage();
	}

}
