package com.car;

public class L5 extends Car implements Temp {

	public L5() {
		super();
		// TODO Auto-generated constructor stub
	}

	public L5(String name, int engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTempGage() {
		// TODO Auto-generated method stub
		return getDistance()/5;
	}

	@Override
	public void go(int distance) {
		// TODO Auto-generated method stub
		setOilSize(getOilSize()-(distance/8));
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
