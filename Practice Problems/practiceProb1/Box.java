package practiceProb;

public class Box {
	private char ch;
	
	public Box(){
		ch = ' ';
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}
	
	public static String isGameOver(Box[][] ttt){
		int countX = 0, countY = 0, j = 0, k = 0, i = 0, countblank = 0;
		for(k=0; k<3; k++){
			if(ttt[k][k].getCh() == 'X')
				countX++;
			else if(ttt[k][k].getCh() == 'Y')		
				countY++;
			else
				break;
		}											//checking for 1,1 and 2,2 and 3,3 boxes
		if(countX != 3 && countY != 3){
			countX = countY = 0;
			for(k=0; k<3; k++){
				if(ttt[k][2-k].getCh() == 'X')
					countX++;
				else if(ttt[k][2-k].getCh() == 'Y')
					countY++;
				else
					break;
			}
		}											//checking for 1,3 and 2,2 and 3,1 boxes
		while((countX != 3 && countY != 3) && j<3){	//checking for all horizontal boxes
			countX = countY = 0;					//everytime before going to next row we set count x and y to 0
			for(i=0; i<3; i++){
				if(ttt[j][i].getCh() == 'X')
					countX++;
				else if(ttt[j][i].getCh() == 'Y')
					countY++;
				else
					countblank++;					//if a position is yet to be filled that is it is blank, we increment countblank
			}
			j++;
		}											
		if(countX != 3 && countY != 3)				//checking if anyone has won till this much processing
			countblank =  j = 0;
		while((countX != 3 && countY != 3) && j<3){	//checking for all vertical boxes
			countX = countY = 0;
			for(i=0; i<3; i++){
				if(ttt[i][j].getCh() == 'X')
					countX++;
				else if(ttt[i][j].getCh() == 'Y')
					countY++;
				else
					countblank++;
			}
			j++;
		}
		if(countX == 3)
			return "Player #1 wins";
		else if(countY == 3)
			return "Player #2 wins";
		else if(countblank==0)						//if none of the places is blank and no player has won then it is a draw
			return "The game is drawn";
		return null;
	}
}