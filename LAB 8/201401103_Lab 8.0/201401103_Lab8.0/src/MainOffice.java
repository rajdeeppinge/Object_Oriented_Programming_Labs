import java.util.Scanner;


public class MainOffice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AddAndSearch member = new AddAndSearch();
		
		System.out.println("Enter the no of employees to be added");
		int n = sc.nextInt();
		sc.nextLine();	//waste a line
		for(int i=0; i<n; i++){
			String[] employeeInfo = sc.nextLine().split(" ");
			Employee newEmployee = new Employee(employeeInfo[0],	//creating new employee
										Integer.parseInt(employeeInfo[1]), 
											Integer.parseInt(employeeInfo[2]), 
												Integer.parseInt(employeeInfo[3]));	
			member.addEmployee(newEmployee); 				//adding new emloyee
		}
		
		System.out.println("Enter the no of queries");
		int m = sc.nextInt();
		sc.nextLine();   //waste a line
		for(int i=0; i<m; i++){
			String[] employeeInfo = sc.nextLine().split(" ");
			Employee[] query = member.searchEmployee(Integer.parseInt(employeeInfo[0]),		//searching the matching employees and storing them in an array of employees in case there are more than one matching employees
												Integer.parseInt(employeeInfo[1]));
			if(query[0] == null)	//if no matching employee
				System.out.println("NOT FOUND");	
			else{
				for(int j=0; query[j]!= null; j++)	//print till array of matching employees is empty
					System.out.print(query[j].getId() + " ");
				System.out.println();
			}
		}
	}
}
