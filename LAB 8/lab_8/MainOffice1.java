package lab_8;

import java.util.Scanner;

public class MainOffice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		AddAndSearch1 member = new AddAndSearch1();
		for(int i=0; i<n; i++){
			String[] employeeInfo = sc.nextLine().split(" ");
			Employee1 newEmployee = new Employee1(employeeInfo[0], Integer.parseInt(employeeInfo[1]),
											Integer.parseInt(employeeInfo[2]), Integer.parseInt(employeeInfo[3]));
			member.addEmployee(newEmployee);
		}
		
		int m = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<m; i++){
		//	String[] employeeInfo = sc.nextLine().split(" ");
			Employee1[] query = member.searchEmployee(sc.nextInt(), sc.nextInt()/*Integer.parseInt(employeeInfo[0]),
																						Integer.parseInt(employeeInfo[1])*/);
			if(query[0] == null){
				System.out.println("NOT FOUND");
			}
			else{
				for(int j=0; query[j]!=null; j++){
					System.out.print(query[j].getId() + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
