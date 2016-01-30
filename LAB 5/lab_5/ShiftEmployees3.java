package lab_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShiftEmployees3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(new File("C:\\Users\\santosh\\Desktop\\Lab5.txt"));
			int totalEmployees = sc.nextInt();
			sc.nextLine();
			ArrayList<Employees3> employeesHQ = new ArrayList<Employees3>(totalEmployees);
			for(int i=0; i<totalEmployees; i++){
				String[] employeeInfo = sc.nextLine().split(", ");
				employeesHQ.add(new Employees3(Integer.parseInt(employeeInfo[0]), employeeInfo[1], Integer.parseInt(employeeInfo[2]), 
						             Integer.parseInt(employeeInfo[3])));
			}
			int m = sc.nextInt();
			int k = sc.nextInt();
			ArrayList<Employees3> optedNew = new ArrayList<Employees3>(m);
			for(int i=0; i<m; i++){
				optedNew.add(searchEmployee(employeesHQ, sc.nextInt()));
			}
			ArrayList<Employees3> employeesNEW = new ArrayList<Employees3>(Math.min(m, k));
			if(m<=k){
				for(int i=0; i<optedNew.size(); i++){
					employeesNEW.add(optedNew.get(i));
					employeesHQ.remove(optedNew.get(i));
				}
			}
			else{
				for(int i=0; i<k; i++){
					Employees3 best = optedNew.get(0);
					for(int j=1; j<optedNew.size(); j++){
						if((optedNew.get(j).getTenure() > best.getTenure()) ||
								((optedNew.get(j).getTenure() == best.getTenure()) && (optedNew.get(j).getSalary() > best.getSalary())))
							best = optedNew.get(j);
					}
					employeesNEW.add(best);
					optedNew.remove(best);
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
	public static Employees3 searchEmployee(ArrayList<Employees3> records, int id){
		for(int i=0; i<records.size(); i++){
			if(records.get(i).getId() == id)
				return records.get(i);
		}
		return null;
	}
}
