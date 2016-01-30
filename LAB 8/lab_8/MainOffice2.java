package lab_8;

import java.util.Scanner;

public class MainOffice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AddAndSearch2 member = new AddAndSearch2();
		
		System.out.println("Enter the no of Employees to be added");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++){
			String[] employeeInfo = sc.nextLine().split(" ");
			Employee2 newEmployee = new Employee2(employeeInfo[0], Integer.parseInt(employeeInfo[1]),
												Integer.parseInt(employeeInfo[2]), Integer.parseInt(employeeInfo[3]));
			member.addEmployee(newEmployee);
		}
		
		System.out.println("Enter the no of queries");
		int m = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<m; i++){
			Employee2[] query = member.searchEmployee(sc.nextInt(), sc.nextInt());
			if(query[0] == null)
				System.out.println("NOT FOUND");
			else{
				for(int j=0; query[j] != null; j++)
					System.out.print(query[j].getId() + " ");
				System.out.println();
			}
		}
		sc.close();
	}
}
