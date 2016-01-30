package lab_4;

public class Cell2 {
	private char life = '-';
	private int rowIndex;
	private int colIndex;
	
	public Cell2(char life, int rowIndex, int colIndex){
		this.life = life;
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}
	
	public char getLife() {
		return life;
	}
	public void setLife(char life) {
		this.life = life;
	}
	
	public char getNextState(){
		int count = Grid2.getNeighbourCount(this, rowIndex, colIndex);
		if((count == 2 || count ==3) && this.life == '*')
			return '*';
		else if(count == 3 && this.life == '-')
			return '*';
		return '-';
	}
}
