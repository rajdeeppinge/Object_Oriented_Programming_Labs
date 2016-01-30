package lab_0;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelStation1 f1 = new FuelStation1("Petrol", 70, 1000);
		FuelStation1 f2 = new FuelStation1("Diesel", 60, 500);
		FuelStation1 f3 = new FuelStation1("CNG", 40, 100);
		FuelStation1 f4 = new FuelStation1("CNG", 45, 500);
		
		Vehicles1 v1 = new Vehicles1("Petrol", 100, f1);
		Vehicles1 v2 = new Vehicles1("CNG", 120, f2);
		Vehicles1 v3 = new Vehicles1("Diesel", 200, f2);
		
		v1.askForFuel();
		v2.askForFuel();
		v2.setFuelStation(f3); //changing fuel station as f2 is a wrong fuel station for v2
		v2.askForFuel();
		f3.addFuel(300); //adding fuel in f3 as it has insufficient fuel
		v2.askForFuel();
		v2.setFuelStation(f4); //sending vehicle v2 to fuel station f4
		v2.askForFuel();
		v3.askForFuel();
	}

}
