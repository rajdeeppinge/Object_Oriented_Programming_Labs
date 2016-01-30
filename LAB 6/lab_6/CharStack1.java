package lab_6;

public class CharStack1 {
	char[] bracket = new char[100];
	int index;
	
	public CharStack1() {
		// TODO Auto-generated constructor stub
		index = -1;
	}
	
	public void push(char c){
		if(index >= 99)
			return;
		bracket[++index] = c;
	}
	
	public char pop(){
		if(index < 0)
			return 'U';
		return bracket[index--];
	}
	
	public boolean isEmpty(){
		if(index < 0)
			return true;
		return false;
	}
}
