package lab_0;

public class Vehicles {
	private String ftype;
	private double fquan;
	private FuelStation station;
	
	Vehicles(String ftype, double fquan, FuelStation station){
		this.ftype=ftype;
		this.fquan=fquan;
		this.station=station;
	}
	
	String getFuelType(){
		return ftype;
	}
	
	void setFuelType(String ftype){
		this.ftype=ftype;
	}
	
	double getFuelQuanRequired(){
		return fquan;
	}
	
	void setFuelQuanRequired(double fquan){
		this.fquan=fquan;
	}
	
	FuelStation getFuelStationToGo(){
		return station;
	}
	
	void setFuelStationToGo(FuelStation station){
		this.station=station;
	}
	
	void AskForFuel(){
			station.SellFuel(ftype, fquan);
	}
}