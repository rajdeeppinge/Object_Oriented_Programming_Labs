package lab_6;

import java.util.Scanner;

public class BalanceBrackets1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalInputs = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<totalInputs; i++){
//			CharStack1 cs = new CharStack1();
			String temp = sc.nextLine();
/*			int j;
			for(j=0; j<temp.length(); j++){
				if((temp.charAt(j) == '{') || (temp.charAt(j) == '(') || (temp.charAt(j) == '['))
					cs.push(temp.charAt(j));
				else if((temp.charAt(j) == '}' && cs.pop() == '{') || (temp.charAt(j) == ']' && cs.pop() == '[') 
																			|| (temp.charAt(j) == ')' && cs.pop() == '('))
					continue;
				else
					break;
			}*/
		//	boolean balanced = isBalanced(temp);
			if(isBalanced(temp))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
	
	public static boolean isBalanced(String temp){
		boolean balanced = true;
		CharStack1 cs = new CharStack1();
		for(int j=0; j<temp.length(); j++){
			if((temp.charAt(j) == '{') || (temp.charAt(j) == '(') || (temp.charAt(j) == '[') || (temp.charAt(j) == '<'))
				cs.push(temp.charAt(j));
			else if((temp.charAt(j) == '}' && cs.pop() == '{') || (temp.charAt(j) == ']' && cs.pop() == '[') 
											|| (temp.charAt(j) == ')' && cs.pop() == '(') || (temp.charAt(j) == '>' && cs.pop() == '<'))
				continue;
			else{
				balanced = false;
				break;
			}
		}
		if(!cs.isEmpty())
			balanced = false;
		return balanced;
	}
}
