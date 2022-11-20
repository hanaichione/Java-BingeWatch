package com.car;

public abstract class Car {
	
	private String name;
	private int engine;
	private int oilTank;
	private int oilSize;
	private int distance;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, int engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	public abstract void go(int distance);

	public abstract void setOil(int oilSize);
	@Override
	public String toString() {
		return "  "+name+"\t\t"+engine+"\t\t"+oilTank+"\t\t"+oilSize+"\t\t"+distance;
	}
	public int getOilSize() {
		return oilSize;
	}
	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
