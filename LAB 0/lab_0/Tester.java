package lab_0;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelStation f1=new FuelStation("Petrol", 70, 10);
		FuelStation f2=new FuelStation("Diesel", 60, 1000);
		FuelStation f3=new FuelStation("Petrol", 80, 100);
		FuelStation f4=new FuelStation("CNG", 30, 1000);
		
		Vehicles v1=new Vehicles("Petrol", 40, f1);
		Vehicles v2=new Vehicles("Diesel", 100, f2);
		Vehicles v3=new Vehicles("CNG", 50, f3);

		v1.AskForFuel();
		v1.setFuelStationToGo(f3);
		v1.AskForFuel();
		
		v2.AskForFuel();
		
		v3.AskForFuel();
		v3.setFuelStationToGo(f4);
		v3.AskForFuel();
		
		System.out.println(f1.getFuelquanAvailable());
		System.out.println(f2.getFuelquanAvailable());
		System.out.println(f3.getFuelquanAvailable());
		System.out.println(f4.getFuelquanAvailable());
	}

}
