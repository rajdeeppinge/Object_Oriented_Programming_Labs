package lab_0;

public class Vehicles3 {
	private String typeReq;
	private double quantReq;
	private FuelStation3 stationToGo;
	
	Vehicles3(String typeReq, double quantReq, FuelStation3 stationToGo){
		this.typeReq=typeReq;
		this.typeReq=typeReq;
		this.stationToGo=stationToGo;
	}
	
	public void askForFuel(){
		stationToGo.sellFuel(typeReq, quantReq);
	}
}
