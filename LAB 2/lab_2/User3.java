package lab_2;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class User3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3[] resident = new Person3[100];
		AuthorisedPerson3[] authorised = new AuthorisedPerson3[100];
		int totalResidents = 0;
		int totalAuthorised = 0;
		
		try{
			Scanner sc = new Scanner(new File("C:\\Users\\santosh\\Desktop\\LAB_2(2).dat"));
			while(sc.hasNextLine()){
				resident[totalResidents] = new Person3();
				resident[totalResidents].setName(sc.nextLine());
				boolean authority = false;
				if(sc.nextLine().endsWith("yes"))
					authority = true;
				resident[totalResidents].setSex(sc.nextLine());
				resident[totalResidents].setAge(Integer.parseInt(sc.nextLine()));
				resident[totalResidents].setAddress(sc.nextLine());
				if(authority){
					authorised[totalAuthorised] = new AuthorisedPerson3();
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
		catch(FileNotFoundException except){
			except.printStackTrace();
		}
		
		System.out.println("Total Residents = " + totalResidents + "\nTotal Authorised Residents = " + totalAuthorised);
		
		for(int i=0; i<totalAuthorised ; i++){
			if(authorised[i].getSex().equals("female")){
				int q1 = authorised[i].elderThanMe(resident, totalResidents);
				System.out.println("Query 1: "+ q1 + ", asked by "+ authorised[i].getName());
			}
		}
		
		for(int i=0; i<totalAuthorised ; i++){
			if(authorised[i].getSex().equals("male")){
				int q2 = authorised[i].oldestMale(resident, totalResidents);
				System.out.println("Query 2: "+ q2 + ", asked by "+ authorised[i].getName());
				break;
			}
		}

		for(int i=0; i<totalAuthorised ; i++){
			if(authorised[i].getAge() < 20){
				String q3 = authorised[i].getNameGivenAddress(resident, totalResidents, "C/34, Reed Street");
				System.out.println("Query 3: "+ q3 + ", asked by "+ authorised[i].getName());
				break;
			}
		}
	}
}
