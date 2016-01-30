package lab_5;

public class Employees {
	private int ID;
	private String name;
	private int tenure;
	private int salary;
	private boolean newOffice = false;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean getNewOfficeStatus(){
		return newOffice;
	}
	public void setNewOfficeStatus(boolean newOffice){
		this.newOffice = newOffice;
	}
}
