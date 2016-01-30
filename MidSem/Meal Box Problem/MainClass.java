import java.util.Scanner;

public class MainClass {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Student student[] = new Student[23];
		
		final int totalStudents = 23;
		
		System.out.println("Enter the order in which the students the students are standing in the begining and the roll no. of John");
			for(int i=0;i<23;i++){
					student[i]=new Student(sc.nextInt());
			}
			int johnRollNo = sc.nextInt();
			Mother johnMom = new Mother(johnRollNo);
			System.out.println(johnMom.totalTime(student));
			System.out.println(johnMom.finalPosition());
	}
}		
