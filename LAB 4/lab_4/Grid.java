package lab_4;

public class Grid {
	private int rows;
	private int columns;
	private char[][] grid = new char[1000][1000];
	private int i=0;
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public char[][] getGrid() {
		return grid;
	}
	public void setGrid(char[][] grid) {
		this.grid = grid;
	}
	public void setGrid(char[] arr){
		for(int j=0; j<columns; j++){
			grid[i][j] = arr[j];
		}
			i++;
	}
	
	public void applyRules(Grid g2){
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				int aliveCount = 0;
				for(int k=i-1; k<=i+1; k++){
					if(k<0 || k>=rows)
						continue;
					else
						for(int l=j-1; l<=j+1; l++){
							if(l<0 || l>=columns || (l==j && k==i))
								continue;
							else{
								if(g2.grid[k][l] == '*')
									aliveCount++;
							}
						}
				}
				if(aliveCount >= 4 && g2.grid[i][j] == '*'){
					this.grid[i][j] = '-';
				}
				else if(aliveCount < 2 && g2.grid[i][j] == '*'){
					this.grid[i][j] = '-';
				}
				else if(aliveCount == 3 && g2.grid[i][j] == '-'){
					this.grid[i][j] = '*';
					this.printGrid();
				}	
			}
		}
	}
	
	public void printGrid(){
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}