
public class TTTBoard {

char board[][];
	
	public TTTBoard(){
		board=new char[3][3];
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				board[i][j]='_';
		}
		
	}

	void userMove(int r,int c){
		board[r][c]='X';
		}
	
	void computerMove(int r,int c){	
		System.out.println("computer plays:" + (r+1) + " " + (c+1));
		board[r][c]='O';
	}
	
 String checkWinner(){
		
		if((board[0][0]=='X' && board[0][1]=='X' && board[0][2]=='X')||
			(board[1][0]=='X' && board[1][1]=='X' && board[1][2]=='X')||	
			(board[2][0]=='X' && board[2][1]=='X' && board[2][2]=='X')||	
			(board[0][0]=='X' && board[1][0]=='X' && board[2][0]=='X')||	
			(board[0][1]=='X' && board[1][1]=='X' && board[2][1]=='X')||	
			(board[0][2]=='X' && board[1][2]=='X' && board[2][2]=='X')||	
			(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X')||
			(board[0][2]=='X' && board[1][1]=='X' && board[2][0]=='X'))
			
			return "user";
			
		else if((board[0][0]=='O' && board[0][1]=='O' && board[0][2]=='O')||
			(board[1][0]=='O' && board[1][1]=='O' && board[1][2]=='O')||	
			(board[2][0]=='O' && board[2][1]=='O' && board[2][2]=='O')||	
			(board[0][0]=='O' && board[1][0]=='O' && board[2][0]=='O')||	
			(board[0][1]=='O' && board[1][1]=='O' && board[2][1]=='O')||	
			(board[0][2]=='O' && board[1][2]=='O' && board[2][2]=='O')||	
			(board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O')||
			(board[0][2]=='O' && board[1][1]=='O' && board[2][0]=='O'))
			
			return "computer";
		
		else
			return "no one";
	}
	
}
