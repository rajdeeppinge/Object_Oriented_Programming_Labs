package lab_4;

public class Grid3 {
	private static int rows, cols;
	private static Cell3[][] life;
	
	public int getRows() {
		return rows;
	}
	public static void setRows(int rows) {
		Grid3.rows = rows;
	}
	public int getCols() {
		return cols;
	}
	public static void setCols(int cols) {
		Grid3.cols = cols;
	}
	
	public static void setState(String[] inputStr){
		life = new Cell3[rows][cols];
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++){
				life[i][j] = new Cell3(inputStr[i].charAt(j), i, j);
			}
		
	}
	
	public static void printState(){
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.println(life[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void printState(Cell3[][] life){
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.println(life[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void nextState(){
		Cell3[][] newLife = new Cell3[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				newLife[i][j] = new Cell3(life[i][j].getnextState(), i, j);
			}
		}
		life = newLife;
	}
	
	public static int getNeighbourCount(Cell3 key, int rowIndex, int colIndex){
		if(key != life[rowIndex][colIndex])
			return -1;
		int count = 0;
		for(int i=Math.max(0, rowIndex-1); i<=Math.min(rowIndex+1, rows-1); i++){
			for(int j=Math.max(0, colIndex-1); j<=Math.min(colIndex+1, cols-1); j++){
				if(!(i == rowIndex && j== colIndex))
					if(life[i][j].getLife() == '*')
						count++;
			}
		}
		return count;
	}
}
