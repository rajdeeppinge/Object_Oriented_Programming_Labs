package lab_4;

public class Grid1 {
	private static int rows;
    private static int cols;
    private static Cell1[][] life;

    public static void setRows(int rows) {Grid1.rows = rows;}
    public static void setCols(int cols) {Grid1.cols = cols;}
    public int getRows() {return rows;}
    public int getCols() {return cols;}

    public static void setState(String[] state) {
        life = new Cell1[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                life[i][j] = new Cell1(state[i].charAt(j), i, j);
            }
    }

    public static void printState() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(life[i][j].getState());
            System.out.println();
        }
    }
    
    public static void printState(Cell1[][] life) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(life[i][j].getState());
            System.out.println();
        }
    }

    public static void nextState() {
        Cell1[][] newLife = new Cell1[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newLife[i][j] = new Cell1(life[i][j].getNextState(), i, j);
            }
        }
        life = newLife;
    }

    public static int getNeighborCount(Cell1 key, int rowIndex, int colIndex) {
        if (life[rowIndex][colIndex] != key) return -1; // Trying to access other cell's row, column
        int count = 0;
        for (int i = Math.max(rowIndex-1, 0); i <= Math.min(rowIndex+1,rows-1); i++) {
            for (int j = Math.max(colIndex-1, 0); j <= Math.min(colIndex+1, cols-1); j++) {
                if (!(i == rowIndex && j == colIndex)) {
                    if (life[i][j].getState() == '*') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
