package lab_6;

import java.util.Scanner;

public class BalanceBrackets2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalInputs = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<totalInputs; i++){
			if(isBalanced(sc.nextLine()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
	
	public static boolean isBalanced(String temp){
		boolean balanced = true;
		CharStack2 myStack = new CharStack2();
		for(int i=0; i<temp.length(); i++){
			if(temp.charAt(i) == '{' || temp.charAt(i) == '(' || temp.charAt(i) == '[' || temp.charAt(i) == '<')
				myStack.push(temp.charAt(i));
			else if((temp.charAt(i) == '}' && myStack.pop() == '{') || (temp.charAt(i) == ')' && myStack.pop() == '(') || 
									(temp.charAt(i) == ']' && myStack.pop() == '[') || (temp.charAt(i) == '>' && myStack.pop() == '<'))
				continue;
			else{
				balanced = false;
				break;
			}
		}
		if(!myStack.isEmpty())
			balanced = false;
		return balanced;
	}
}
