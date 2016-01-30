package lab_5;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignOffice as = new AssignOffice();
		Employees[] employee = new Employees[10000];
		try{
			Scanner sc = new Scanner(new File("D:\\SEMESTER 2\\IT 115 LAB\\LAB 5\\in1"));
			int noOfEmployees = Integer.parseInt(sc.nextLine());
			as.setTotalEmployees(noOfEmployees);
			for(int i=0; i<noOfEmployees; i++){
				employee[i] = new Employees();
				String employeeInfo[] = sc.nextLine().split(",");
				as.setEmployeeInfo(employeeInfo, employee[i]);
			}
			as.setNewOffApplicants(sc.nextInt());
	//		System.out.println(as.getNewOffApplicants());
			as.setVacanciesInNewOff(Integer.parseInt(sc.nextLine().trim()));
	//		System.out.println(as.getVacanciesInNewOff());
			for(int j=0; j<as.getNewOffApplicants(); j++){
				as.Store(Integer.parseInt(sc.nextLine()), employee);
			}
			if(as.getNewOffApplicants() > as.getVacanciesInNewOff()){
				as.Filter();
			}
			sc.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		as.printInfo(employee);
	}
}
