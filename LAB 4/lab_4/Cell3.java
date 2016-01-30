package lab_4;

public class Cell3 {
	private char life = '-';
	private int rowIndex;
	private int colIndex;
	
	public Cell3(char life, int rowIndex, int colIndex){
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
	
	public char getnextState(){
		int count = Grid3.getNeighbourCount(this, this.rowIndex, this.colIndex);
		if((count == 2 || count == 3) && this.getLife() == '*')
			return '*';
		else if(count == 3 && this.getLife() == '-')
			return '*';
		return '-';
	}
}
