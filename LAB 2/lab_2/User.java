package lab_2;

import java.util.Scanner;
//import java.lang.*;
import java.io.File;
import java.io.FileNotFoundException;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] residents = new Person[100];
		AuthorisedPerson[] authorisedResidents = new AuthorisedPerson[100];
		int totalResidents = 0;
		int totalAuthorised = 0;
		
		try{
			Scanner sc; 
			sc = new Scanner(new File("D:\\SEMESTER 2\\IT 115 LAB\\LAB_2.dat"));
			while(sc.hasNextLine()){
				residents[totalResidents] = new Person();
				residents[totalResidents].setName(sc.nextLine());
				boolean authority = false;
				if(sc.nextLine().endsWith("yes"))
					authority = true;
				residents[totalResidents].setSex(sc.nextLine());
				residents[totalResidents].setAge((int) Integer.parseInt(sc.nextLine()));
				residents[totalResidents].setAddress(sc.nextLine());
				if(authority){
					authorisedResidents[totalAuthorised] = new AuthorisedPerson();
					authorisedResidents[totalAuthorised].setName(residents[totalResidents].getName());
					authorisedResidents[totalAuthorised].setSex(residents[totalResidents].getSex());
					authorisedResidents[totalAuthorised].setAge(residents[totalResidents].getAge());
					authorisedResidents[totalAuthorised].setAddress(residents[totalResidents].getAddress());
					totalAuthorised++;
				}
				totalResidents++;
			}
			sc.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("Total Residents = " + totalResidents + " Total Authorised = " + totalAuthorised);
		for(int i=0; i<totalAuthorised; i++){
			int q1 = 0;
			if(authorisedResidents[i].getSex().equals("female")){
				q1 = authorisedResidents[i].elderThanMe(residents, totalResidents);
				System.out.println("Query 1 : " + q1 + " Asked by " + authorisedResidents[i].getName());
			}
		}
		
		for(int i=0; i<totalAuthorised; i++){
			int q2 = 0;
			if(authorisedResidents[i].getSex().equals("male")){
				q2 = authorisedResidents[i].oldestMaleAge(residents, totalResidents);
				System.out.println("Query 2 : " + q2 + " Asked by " + authorisedResidents[i].getName());
				break;
			}
		}

		for(int i=0; i<totalAuthorised; i++){
			String q3;
			if(authorisedResidents[i].getAge() < 20){
				q3 = authorisedResidents[i].getNameGivenAge(residents, totalResidents, "C/34, Reed Street");
				System.out.println("Query 3 : " + q3 + " Asked by " + authorisedResidents[i].getName());
			}
		}
	}
}
