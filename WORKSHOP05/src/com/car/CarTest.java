package com.car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars[] = new Car[2];

		cars[0] = new L3("L3", 1500, 50, 25, 0);
		cars[1] = new L5("L5", 2000, 70, 35, 0);

		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		for (int i = 0; i < cars.length; i++) {
			if(cars[i] instanceof L3) {
				L3 l3 = (L3) cars[i];
				System.out.println(l3.toString());
			} else {
				L5 l5 = (L5) cars[i];
				System.out.println(l5.toString());
			}
		}
		
		System.out.println("\n25 주유");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		for (int i = 0; i < cars.length; i++) {
			cars[i].setOil(25);
			if(cars[i] instanceof L3) {
				L3 l3 = (L3) cars[i];
				System.out.println(l3.toString());
			} else {
				L5 l5 = (L5) cars[i];
				System.out.println(l5.toString());
			}
		}
		
		System.out.println("\n80 주행");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("---------------------------------------------------------------------------------------------");
		for (int i = 0; i < cars.length; i++) {
			cars[i].go(80);
			if(cars[i] instanceof L3) {
				L3 l3 = (L3) cars[i];
				System.out.println(l3.toString());
			} else {
				L5 l5 = (L5) cars[i];
				System.out.println(l5.toString());
			}
		}
	}

}
