package lab_4;

import java.io.File;
import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:\\Users\\santosh\\Desktop\\Lab4.txt"));
		int m,n;
		m = sc.nextInt();
		n = sc.nextInt();
		sc.nextLine();
		String[] inputStr = new String [m];
		for(int i=0; i<m; i++){
			inputStr[i] = sc.nextLine();
		}
		Grid3.setRows(m);
		Grid3.setCols(n);
		Grid3.setState(inputStr);
		
		for(int i=0; i<100; i++){
			Grid3.nextState();
			Grid3.printState();
			System.out.println("State : " + (i+1));
		}
		sc.close();
	}

}
