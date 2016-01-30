package practiceProb;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Box[][] ttt = new Box[3][3];
		String st = null;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				ttt[i][j] = new Box();	//creating each box and storing ' ' in it.
			}
		}
		for(int i=0; i<9; i++){
			int x = sc.nextInt()-1;		//since both x and y range from [1,3]
			int y = sc.nextInt()-1;
			if(i%2 == 0)				//it means player 1's move as player 1 moves when i is even
				ttt[x][y].setCh('X');
			else
				ttt[x][y].setCh('Y');
			st = Box.isGameOver(ttt);	//checking if game is over. "st" receives appropriate output
			if(st != null)				
				break;
		}
		if(st != null)
			System.out.println(st);		
		sc.close();
	}

}
