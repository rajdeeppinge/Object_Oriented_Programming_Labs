package lab_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShiftEmployees1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(new File("C:\\Users\\santosh\\Desktop\\Lab5.txt"));
			int numEmployees = sc.nextInt();
			sc.nextLine();
			ArrayList<Employees1> employeesHQ = new ArrayList<Employees1>(numEmployees);
			for(int i=0; i<numEmployees; i++){
				String employeeInfo[] = sc.nextLine().split(", ");
				employeesHQ.add(new Employees1(Integer.parseInt(employeeInfo[0]), employeeInfo[1], Integer.parseInt(employeeInfo[2]), 
												Integer.parseInt(employeeInfo[3])));
			}
			
			int m = sc.nextInt();
			int k = sc.nextInt();
			sc.nextLine();
			
			ArrayList<Employees1> optedNew = new ArrayList<Employees1>(m);
			for(int i=0; i<m; i++){
				optedNew.add(Employees1.searchEmployee(employeesHQ, sc.nextInt()));
			}
			
			ArrayList<Employees1> employeesNew = new ArrayList<Employees1>(k);
			for(int i=0; i<Math.min(m, k); i++){
				Employees1 best = optedNew.get(0);
				for(int j=1; j<optedNew.size(); j++){
					if((optedNew.get(j).getTenure() > best.getTenure()) || ((optedNew.get(j).getTenure() == best.getTenure()) && 
																			(optedNew.get(j).getSalary() > best.getSalary())))
						best = optedNew.get(j);
				}
				employeesNew.add(best);
				optedNew.remove(best);
				employeesHQ.remove(best);
			}
			
			System.out.println("HQ");
			for(int i=0; i<employeesHQ.size(); i++)
				System.out.println(employeesHQ.get(i).getId());
			System.out.println("NEW");
			for(int i=0; i<employeesNew.size(); i++)
				System.out.println(employeesNew.get(i).getId());
			
			
	/*		   public static Employee searchEmployees(ArrayList<Employee> records, int id) {
			        for (int i = 0; i < records.size(); i++) if (records.get(i).getId() == id) return records.get(i);
			        return null; // failed to find
			    }
			   
			public static Employees1 searchEmployee(ArrayList<Employees1> records, int id){
				for(int i=0; i<records.size(); i++){
					if(records.get(i).getId() == id)
						return records.get(i);
				}
				return null;
			}
	*/
			sc.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		

	}
}
