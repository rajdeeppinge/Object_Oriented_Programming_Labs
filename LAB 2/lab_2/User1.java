package lab_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1[] resident = new Person1[100];
		AuthorisedPerson1[] authorised = new AuthorisedPerson1[100];
		int totalResidents = 0;
		int totalAuthorised = 0;
		
		try{
			Scanner sc; 
			sc = new Scanner(new File("D:\\SEMESTER 2\\IT 115 LAB\\LAB_2.dat"));
			while(sc.hasNextLine()){
				resident[totalResidents] = new Person1();
				resident[totalResidents].setName(sc.nextLine());
				boolean authority = false;
				if(sc.nextLine().endsWith("yes"))
					authority = true;
				resident[totalResidents].setSex(sc.nextLine());
				resident[totalResidents].setAge(Integer.parseInt(sc.nextLine()));
				resident[totalResidents].setAddress(sc.nextLine());
				if(authority){
					authorised[totalAuthorised] = new AuthorisedPerson1();
					authorised[totalAuthorised].setName(resident[totalResidents].getName());
					authorised[totalAuthorised].setSex(resident[totalResidents].getSex());
					authorised[totalAuthorised].setAge(resident[totalResidents].getAge());
					authorised[totalAuthorised].setAddress(resident[totalResidents].getAddress());
					totalAuthorised++;
				}
				totalResidents++;
			}
			sc.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("Total Residents = " + totalResidents + " Total Authorised Residents = " + totalAuthorised);
		
		for(int i=0; i<totalAuthorised; i++){
			int q1 = 0;
			if(authorised[i].getSex().equals("female")){
				q1 = authorised[i].elderThanMe(resident, totalResidents);
				System.out.println("Query 1 : " + q1 + " Asked by " + authorised[i].getName());
			}
		}
		
		for(int i=0; i<totalAuthorised; i++){
			int q2 = 0;
			if(authorised[i].getSex().equals("male")){
				q2 = authorised[i].oldestMale(resident, totalResidents);
				System.out.println("Query 2 : " + q2 + " Asked by " + authorised[i].getName());
				break;
			}
		}
		
		for(int i=0; i<totalAuthorised; i++){
			String q3;
			if(authorised[i].getAge() < 20){
				q3 = authorised[i].getNameGivenAddress(resident, totalResidents, "C/34, Reed Street");
				System.out.println("Query 3 : " + q3 + " Asked by " + authorised[i].getName());
				break;
			}
		}
	}

}
