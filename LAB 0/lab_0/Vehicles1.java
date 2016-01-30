package lab_0;

public class Vehicles1 {
	String typereq;
	double quanreq;
	FuelStation1 ff;
	
	Vehicles1(String typereq, double quanreq, FuelStation1 ff){
		this.typereq=typereq;
		this.quanreq=quanreq;
		this.ff=ff;
	}
	
	String getTypeReq(){
		return typereq;
	}
	
	void setTypeReq(String typereq){
		this.typereq=typereq;
	}
	
	double getQuanReq(){
		return quanreq;
	}
	
	void setQuanReq(double quanreq){
		this.quanreq=quanreq;
	}
	
	FuelStation1 getFuelStation(){
		return ff;
	}
	
	void setFuelStation(FuelStation1 ff){
		this.ff=ff;
	}
	
	void askForFuel(){
		ff.sellFuel(typereq, quanreq);
	}
}
