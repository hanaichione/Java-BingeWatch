package vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck car = new Truck(1000, 100, 5);
		
		System.out.println("최대적재중량\t오일탱크크기\t잔여오일량\t\t현재적재중량\t연비");
		System.out.println(car.toString());
		
		car.addOil(50);
		System.out.println("\n50L 주유 후");
		System.out.println(car.toString());

		car.moving(50);
		System.out.println("\n50km 주행 후");
		System.out.println(car.toString());

		car.addWeight(100);
		System.out.println("\n100kg 적재 후");
		System.out.println(car.toString());

		car.moving(30);
		System.out.println("\n30km 주행 후");
		System.out.println(car.toString());
		
		System.out.println("\n요금 : " + car.getCost(30)+"원");
	}

}
