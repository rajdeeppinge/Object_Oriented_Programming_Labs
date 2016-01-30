package lab_0;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelStation2 f1 = new FuelStation2("Petrol", 70, 100);
		FuelStation2 f2 = new FuelStation2("Petrol", 75, 1000);
		FuelStation2 f3 = new FuelStation2("Diesel", 60, 500);
		FuelStation2 f4 = new FuelStation2("CNG", 40, 300);
		
		Vehicles2 v1 = new Vehicles2("Petrol", 150, f1);
		Vehicles2 v2 = new Vehicles2("CNG", 50, f2);
		Vehicles2 v3 = new Vehicles2("Diesel", 500, f3);
		
		System.out.println("v1 asking fuel");
		v1.askForFuel();
		v1.getFuelStation();
		//System.out.println(v1.getFuelStation());
		v1.setFuelStation(f2);
		System.out.println(f2.getFuelPrice());
		v1.askForFuel();
		
		System.out.println("v2 asking fuel");
		v2.askForFuel();
		v2.setFuelStation(f4);
		v2.askForFuel();
		
		System.out.println("v3 asking fuel");
		v3.askForFuel();
	}

}
