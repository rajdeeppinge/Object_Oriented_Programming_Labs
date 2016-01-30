package lab_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		AddAndSearch member = new AddAndSearch();
		for(int i=0; i<n; i++){
			String[] employeeInfo = sc.nextLine().split(" ");
			Employee e1 = new Employee(employeeInfo[0], Integer.parseInt(employeeInfo[1]), Integer.parseInt(employeeInfo[2]),
											Integer.parseInt(employeeInfo[3]));
			member.addEmployee(e1);
		}
		int m = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<m; i++){
			String[] search = sc.nextLine().split(" ");
			Employee[] temp = member.searchEmployee(Integer.parseInt(search[0]), Integer.parseInt(search[1]));
			if(temp[0] == null)
				System.out.println("NOT FOUND");
			else{
				for(int j=0; temp[j] != null; j++){
					System.out.print(temp[j].getId() +  " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
