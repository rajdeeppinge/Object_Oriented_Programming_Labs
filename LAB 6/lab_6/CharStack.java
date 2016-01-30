package lab_6;

public class CharStack {
	private char[] brackett = new char[100];
	private int index;
	
	public CharStack(){
		index = -1;
	}
	
	public void push(char c){
		if(index >= 99)
			return;
		brackett[++index] = c;
	}
	
	public char pop(){
		if(index < 0)
			return 'U';
		return brackett[index--];
	}
}
