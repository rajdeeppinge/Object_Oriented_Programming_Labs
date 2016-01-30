package lab_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShiftEmployees2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(new File("C:\\Users\\santosh\\Desktop\\Lab5.txt"));
			int numEmployees = sc.nextInt();
	//		System.out.println(numEmployees);
			sc.nextLine();
			ArrayList<Employees2> employeesHQ = new ArrayList<Employees2>(numEmployees);
			for(int i=0; i<numEmployees; i++){
				String employeeInfo[] = sc.nextLine().split(", ");
	//			System.out.println(employeeInfo.length);
				employeesHQ.add(new Employees2(Integer.parseInt(employeeInfo[0]), employeeInfo[1], Integer.parseInt(employeeInfo[2]),
																				Integer.parseInt(employeeInfo[3])));
			}
			int m = sc.nextInt();
			int k = sc.nextInt();
			ArrayList<Employees2> optedEmployees = new ArrayList<Employees2>(m);
			for(int i=0; i<m; i++){
				optedEmployees.add(searchEmployee(employeesHQ, sc.nextInt()));
			}
			ArrayList<Employees2> employeesNEW = new ArrayList<Employees2>(Math.min(m, k));
			if(m<=k){
				System.out.println("m<=k");
				for(int i=0; i<m; i++){
					employeesNEW.add(optedEmployees.get(i));
					employeesHQ.remove(optedEmployees.get(i));
				}
			}
			else{
				for(int i=0; i<k; i++){
					Employees2 best = optedEmployees.get(0);
					for(int j=1; j<optedEmployees.size(); j++){
						if((optedEmployees.get(j).getTenure() > best.getTenure()) || 
								((optedEmployees.get(j).getTenure() == best.getTenure()) && (optedEmployees.get(j).getSalary() > best.getSalary()))){
							best = optedEmployees.get(j);
						}
					}
					employeesNEW.add(best);
					optedEmployees.remove(best);
					employeesHQ.remove(best);
				}
			}
			System.out.println("HQ");
			for(int i=0; i<employeesHQ.size(); i++)
				System.out.println(employeesHQ.get(i).getId());
			System.out.println("NEW");
			for(int i=0; i<employeesNEW.size(); i++)
				System.out.println(employeesNEW.get(i).getId());
			sc.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static Employees2 searchEmployee(ArrayList<Employees2> records, int id){
		for(int i=0; i<records.size(); i++){
			if(records.get(i).getId() == id)
				return records.get(i);
		}
		return null;
	}
}
