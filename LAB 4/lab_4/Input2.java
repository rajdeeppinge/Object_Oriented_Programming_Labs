package lab_4;

import java.util.Scanner;
import java.io.*;

public class Input2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:\\Users\\santosh\\Desktop\\Lab4.txt"));
		int m,n;
		m = sc.nextInt();
		n=sc.nextInt();
		sc.nextLine();
		String[] inputStr = new String[m];
		Grid2.setRows(m);
		Grid2.setCols(n);
		for(int i=0; i<m; i++){
			inputStr[i] = sc.nextLine();
		}
		Grid2.setState(inputStr);
		for(int i=0; i<100; i++){
			Grid2.nextState();
			Grid2.printState();
			System.out.println("State : " + (i+1));
		}
		sc.close();
	}

}
