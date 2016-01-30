package lab_6;

public class CharStack2 {
	private char[] brackets;
	private int index;
	
	public CharStack2(){
		brackets = new char[100];
		index = -1;
	}
	
	public void push(char ch){
		if(index >= 99)
			return;
		brackets[++index] = ch;
	}
	
	public char pop(){
		if(this.isEmpty())
			return 'U';
		return brackets[index--];
	}
	
	public boolean isEmpty(){
		if(index < 0)
			return true;
		return false;
	}
}
