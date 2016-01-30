package mealBox;

import java.util.Scanner;

public class MainMealBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of students at the bus stop");
		int totalStudents = sc.nextInt();
		SchoolKid[] student = new SchoolKid[totalStudents];
		
		for(int i=0; i<totalStudents; i++){
			student[i] = new SchoolKid(sc.nextInt());
		}
		
		System.out.println("Enter John's roll no");
		int johnRollNo = sc.nextInt();
		sc.close();
		
		Mother johnMom = new Mother(johnRollNo, totalStudents);
		System.out.println(johnMom.timeTaken(student));
	//	System.out.println(johnMom.totalTime(student));
		System.out.println(johnMom.finalPosition());
		
	}
}
