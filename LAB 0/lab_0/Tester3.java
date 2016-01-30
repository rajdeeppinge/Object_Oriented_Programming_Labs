package lab_0;

public class Tester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelStation3 f1 = new FuelStation3("Petrol", 70, 100);
		FuelStation3 f2 = new FuelStation3("Diesel", 60, 1000);
//		FuelStation3 f3 = new FuelStation3("Petrol", 75, 500);
		FuelStation3 f4 = new FuelStation3("CNG", 40, 300);
		
		Vehicles3 v1 = new Vehicles3("Petrol", 120, f1);
		Vehicles3 v2 = new Vehicles3("Diesel", 500, f2);
		Vehicles3 v3 = new Vehicles3("Petrol", 50, f4);
		
		v1.askForFuel();
		v2.askForFuel();
		v3.askForFuel();
	}

}
