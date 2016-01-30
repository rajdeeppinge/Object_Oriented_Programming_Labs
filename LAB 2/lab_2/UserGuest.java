package lab_2;

import java.io.*;
import java.util.*;

public class UserGuest {


	
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		try
		{
		File f1 = new File("C:\\Users\\santosh\\Desktop\\LAB_2.dat");
		Scanner sc = new Scanner(f1);
		Residents r[]=new Residents[50];
		AuthorisedResidents ar[] = new AuthorisedResidents[50];
		int i=0,j=0;
		while(sc.hasNextLine()){
			ar[i]=new AuthorisedResidents();
			ar[i].setName(sc.nextLine());
			sc.next();
			ar[i].setAuthority(sc.next());
			sc.nextLine();			
			ar[i].setSex(sc.nextLine());
			ar[i].setAge(Integer.parseInt(sc.nextLine()));
			ar[i].setAddress(sc.nextLine());
			if(ar[i].getAuthority().equals("yes")){
				r[j]=new AuthorisedResidents();
				r[j]=ar[i];
				j++;
			}
			i++;
		}
		ar[0].olderThanMe(ar, i);
		ar[2].oldestMale(ar, i);
		ar[3].wantName("C/34, Reed Street", ar, i);
		
		sc.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
