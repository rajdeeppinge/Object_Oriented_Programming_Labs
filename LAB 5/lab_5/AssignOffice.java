package lab_5;

public class AssignOffice {
	private int newOffApplicants, VacanciesInNewOff, totalEmployees;

	public int getNewOffApplicants() {
		return newOffApplicants;
	}

	public void setNewOffApplicants(int newOffApplicants) {
		this.newOffApplicants = newOffApplicants;
	}

	public int getVacanciesInNewOff() {
		return VacanciesInNewOff;
	}

	public void setVacanciesInNewOff(int vacanciesInNewOff) {
		VacanciesInNewOff = vacanciesInNewOff;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}
	
	public void setEmployeeInfo(String employeeInfo[], Employees employee){
		employee.setID(Integer.parseInt(employeeInfo[0]));
		employee.setName(employeeInfo[1]);
		employee.setTenure(Integer.parseInt(employeeInfo[2]));
		employee.setSalary(Integer.parseInt(employeeInfo[3]));
	}
	
	Employees[] wantShift = new Employees[1000];
	int z=0;
	
	public void Store(int shiftID, Employees[] employee){
		if(newOffApplicants <= VacanciesInNewOff){
			for(int i=0; i<totalEmployees; i++){
				if(employee[i].getID() == shiftID){
					employee[i].setNewOfficeStatus(true);
				}
			}
		}
		else{;
			for(int i=0; i<totalEmployees; i++){
				if(shiftID == employee[i].getID()){
					wantShift[z] = employee[i];
					z++;
					break;
				}
			}
		}	
	}
	
	public void Filter(){
		Employees temp = new Employees();
		for(int i=0; i<z-1; i++)
			for(int j=0; j<z-1-i; j++){
				if(wantShift[j].getTenure() < wantShift[j+1].getTenure()){
					temp = wantShift[j];
					wantShift[j] = wantShift[j+1];
					wantShift[j+1] = temp;
				}
				else if(wantShift[j].getSalary() < wantShift[j+1].getSalary()){
					temp = wantShift[j];
					wantShift[j] = wantShift[j+1];
					wantShift[j+1] = temp;
				}
			}
		for(int i=0; i<VacanciesInNewOff; i++){
			wantShift[i].setNewOfficeStatus(true);
		}
	}
	
	public void printInfo(Employees[] employee){
		System.out.println("HQ");
		for(int i=0; i<totalEmployees; i++){
			if(!employee[i].getNewOfficeStatus())
				System.out.println(employee[i].getID());
		}
		System.out.println("NEW");
		for(int i=0; i<totalEmployees; i++){
			if(employee[i].getNewOfficeStatus())
				System.out.println(employee[i].getID());
		}
	}
}
