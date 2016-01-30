package lab_4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Simulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(new File("C:\\Users\\santosh\\Desktop\\Lab4.txt"));
			Grid G1 = new Grid();
			Grid g2 = new Grid();
			G1.setRows(sc.nextInt());
			G1.setColumns(sc.nextInt());
			g2.setRows(G1.getRows());
			g2.setColumns(G1.getColumns());
			sc.nextLine();
			while(sc.hasNextLine()){
				char[] arr = sc.nextLine().toCharArray();
				G1.setGrid(arr);
			}
			for(int i=0; i<2; i++){
				g2.setGrid(G1.getGrid());
				G1.applyRules(g2);
				
			}
			G1.printGrid();
			sc.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
