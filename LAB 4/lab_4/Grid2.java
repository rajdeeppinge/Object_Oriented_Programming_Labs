package lab_4;

public class Grid2 {
	private static int rows;
	private static int cols;
	private static Cell2[][] life;
	
	public static int getRows() {
		return rows;
	}
	public static void setRows(int rows) {
		Grid2.rows = rows;
	}
	public static int getCols() {
		return cols;
	}
	public static void setCols(int cols) {
		Grid2.cols = cols;
	}
	
	public static void setState(String[] inputStr){
		life = new Cell2[rows][cols];
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++){
				life[i][j] = new Cell2(inputStr[i].charAt(j), i, j);
			}
	}
	
	public static void nextState(){
		Cell2[][] newLife = new Cell2[rows][cols];
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++){
				newLife[i][j] = new Cell2(life[i][j].getNextState(), i, j);
			}
		life = newLife;
	}
	
	public static int getNeighbourCount(Cell2 key, int rowIndex, int colIndex){
		if(key != life[rowIndex][colIndex])
			return -1;
		int count =0;
		for(int i=Math.max(rowIndex-1, 0); i<=Math.min(rowIndex+1, rows-1); i++)
			for(int j=Math.max(colIndex-1, 0); j<=Math.min(colIndex+1, cols-1); j++)
				if(!(i == rowIndex && j == colIndex)){
					if(life[i][j].getLife() == '*')
						count++;
				}
		return count;
	}
	
	public static void printState(){
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(life[i][j].getLife());
            System.out.println();
		}
	}
		
	public static void printState(Cell2[][] life){
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(life[i][j].getLife());
            System.out.println();
		}
	}
}
