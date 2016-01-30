package lab_0;

class FuelStation {
	private String fueltype;
	private double fuelprice;
	private double fuelquan;
	
	FuelStation(String fueltype, double fuelprice, double fuelquan){
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
	
	double getFuelquanAvailable(){
		return fuelquan;
	}
	
	void addFuel(double add){
		fuelquan+=add;
	}
	
	void SellFuel(String ftype, double fquan){
		if(!(fueltype.equals(ftype)))
			System.out.println("Wrong Fuel Station");
		else if(fuelquan<fquan)
			System.out.println("Insufficient Fuel");
		else{
			fuelquan-=fquan;
			this.ViewTranDet(fquan);
		}
	}
	
	void ViewTranDet(double fquan){
			System.out.println("Total Bill = " + (fuelprice*fquan));
	}
}
