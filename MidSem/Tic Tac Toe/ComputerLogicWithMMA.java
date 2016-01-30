public class ComputerLogicWithMMA {

	public void makeMove(TTTBoard tb){
	
	int max=-100000;
	int a=0,b=0;
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			if(tb.board[i][j]=='_'){
				
				char temp[][]=new char[3][3];
				copyBoard(tb.board,temp);
				
				temp[i][j]='O';
				int x=minVal(temp);
				
				if(x>max){
						max=x;
						a=i;b=j;
				}
			}
			
		}
	}
	tb.computerMove(a,b);
	}
	
	public void copyBoard(char tb[][],char tb1[][]){
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				tb1[i][j]=tb[i][j];
			}
		}
		
	}
	public int maxVal(char arr[][]){
		int b=baseVal(arr);
		if(b==-1 || b==1)
			return b;
		int max=-100000;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(arr[i][j]=='_'){
					char temp[][]=new char[3][3];
					copyBoard(arr,temp);					
					temp[i][j]='O';
					int x=minVal(temp);
					if(x>max)
							max=x;
					}
			}
		}	
	
	if(max!=-100000)
		return max;
	else
		return 0;										//corresponds to a draw
	
	}
	
	public int minVal(char arr[][]){
		int b=baseVal(arr);
		
		if(b==-1 || b==1)
			return b;
		
		int min=100000;

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(arr[i][j]=='_'){
					char temp[][]=new char[3][3];
					copyBoard(arr,temp);
					
					temp[i][j]='X';
					int x=maxVal(temp);
					if(x<min)
							min=x;
				}
				
			}
		}	
	if(min!=100000)
		return min;
	else 
		return 0;
	}
	
	public int baseVal(char arr[][]){
		
		if((arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]=='X')||
				(arr[1][0]=='X' && arr[1][1]=='X' && arr[1][2]=='X')||	
				(arr[2][0]=='X' && arr[2][1]=='X' && arr[2][2]=='X')||	
				(arr[0][0]=='X' && arr[1][0]=='X' && arr[2][0]=='X')||	
				(arr[0][1]=='X' && arr[1][1]=='X' && arr[2][1]=='X')||	
				(arr[0][2]=='X' && arr[1][2]=='X' && arr[2][2]=='X')||	
				(arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X')||
				(arr[0][2]=='X' && arr[1][1]=='X' && arr[2][0]=='X'))
				
				return -1;
				
			else if((arr[0][0]=='O' && arr[0][1]=='O' && arr[0][2]=='O')||
				(arr[1][0]=='O' && arr[1][1]=='O' && arr[1][2]=='O')||	
				(arr[2][0]=='O' && arr[2][1]=='O' && arr[2][2]=='O')||	
				(arr[0][0]=='O' && arr[1][0]=='O' && arr[2][0]=='O')||	
				(arr[0][1]=='O' && arr[1][1]=='O' && arr[2][1]=='O')||	
				(arr[0][2]=='O' && arr[1][2]=='O' && arr[2][2]=='O')||	
				(arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O')||
				(arr[0][2]=='O' && arr[1][1]=='O' && arr[2][0]=='O'))
				
				return 1;
			
			else
				return 0;
	}
}
