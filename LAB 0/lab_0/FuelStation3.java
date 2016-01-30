package lab_0;

public class FuelStation3 {
	private String typeAvailable;
	private double fuelPrice;
	private double quantAvailable;
	
	FuelStation3(String typeAvailable, double fuelPrice, double quantAvailable){
		this.typeAvailable=typeAvailable;
		this.fuelPrice=fuelPrice;
		this.quantAvailable=quantAvailable;
	}
	
	public void sellFuel(String typeReq, double quantReq){
		if(!(typeReq.equals(typeAvailable)))
			System.out.println("The fuel type demanded by you is not available with us");
		else if(quantAvailable < quantReq)
			System.out.println("Sorry, the quantity of fuel demanded by you is not available here");
		else{
			quantAvailable-=quantReq;
			transactionDetails(quantReq);
		}
	}
	
	public void transactionDetails(double quantReq){
		double bill=(fuelPrice*quantReq);
		System.out.println("The fuel demanded by you has been filled in your car,\n Your total bill = "+bill);
	}
}
