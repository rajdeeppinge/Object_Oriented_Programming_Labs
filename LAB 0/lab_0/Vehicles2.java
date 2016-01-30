package lab_0;

public class Vehicles2 {
	String typereq;
	double quanreq;
	FuelStation2 ff;
	
	Vehicles2(String typereq, double quanreq, FuelStation2 ff){
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
	
	FuelStation2 getFuelStation(){
		return ff;
	}
	
	void setFuelStation(FuelStation2 ff){
		this.ff=ff;
	}
	
	void askForFuel(){
		ff.sellFuel(typereq, quanreq);
	}
}
