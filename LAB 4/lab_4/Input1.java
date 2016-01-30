package lab_4;

import java.util.Scanner;
import java.io.File;

public class Input1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner readFile = new Scanner(new File("C:\\Users\\santosh\\Desktop\\Lab4.txt"));
        int m, n;
        m = readFile.nextInt();
        n = readFile.nextInt();
        readFile.nextLine(); // The first line will contain ''
        String[] inputState = new String[m];
        Grid1.setRows(m);
        Grid1.setCols(n);
        for (int i = 0; i < m; i++) {
            inputState[i] = readFile.nextLine();
        }
        Grid1.setState(inputState);
        for (int i = 0; i < 100; i++) {
            Grid1.nextState();
            Grid1.printState();
            System.out.println("State: "+(i+1));
   //         Thread.sleep(600);
   //         if (i != 99)
   //             for (int j = 0; j < 60; j++) System.out.print('\f');
        }
        readFile.close();
	}

}
