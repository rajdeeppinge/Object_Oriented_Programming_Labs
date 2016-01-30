package lab_0;

public class FuelStation2 {
	private String fueltype;
	private double fuelprice;
	private double fuelquan;
	
	FuelStation2(String fueltype, double fuelprice, double fuelquan){
		this.fueltype=fueltype;
		this.fuelprice=fuelprice;
		this.fuelquan=fuelquan;
	}
	
	String getFuelType(){
		return fueltype;
	}
	
	void setFuelType(String fueltype){
		this.fueltype=fueltype;
	}
	
	double getFuelPrice(){
		return fuelprice;
	}
	
	void setFuelPrice(double fuelprice){
		this.fuelprice=fuelprice;
	}
	
	double getFuelQuanAvailable(){
		return fuelquan;
	}
	
	void addFuel(double extra){
		fuelquan+=extra;
	}
	
	void sellFuel(String typereq, double quanreq){
		if(!(fueltype.equals(typereq)))
			System.out.println("Wrong Fuel Station");
		else if(fuelquan < quanreq)
			System.out.println("Insufficient Fuel");
		else{
			fuelquan-=quanreq;
			this.viewTranDet(typereq, quanreq);
		}
	}
	
	void viewTranDet(String typereq, double quanreq){
		double bill;
		bill=fuelprice*quanreq;
		System.out.println("Fuel has been filled,\nTotal bill = " + bill);
	}
}
