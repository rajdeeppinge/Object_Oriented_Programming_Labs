package mealBox;

import java.util.Scanner;

public class MainMealBox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of students at the bus stop");
		int totalStudents = sc.nextInt();
		
		SchoolKid1[] students = new SchoolKid1[totalStudents];
		for(int i=0; i<totalStudents; i++){
			students[i] = new SchoolKid1(sc.nextInt());
		}
		
		System.out.println("Enter John's roll no");
		int johnRollNo = sc.nextInt();
		
		System.out.println("Enter the time after which the position is shifted");
		int shiftTime = sc.nextInt();
		
		System.out.println("Enter the no of positions a person shifts after each iteration");
		int shiftPos = sc.nextInt();
		
		sc.close();
		
		Mother1 johnMom = new Mother1(johnRollNo, totalStudents);
		System.out.println(johnMom.timeTaken(students));
		System.out.println(johnMom.finalPosition(shiftTime, shiftPos));
	}

}
