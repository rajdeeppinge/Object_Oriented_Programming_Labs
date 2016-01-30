package lab_6;

import java.util.Scanner;

public class BalanceBracketts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalInputs = sc.nextInt();
		sc.nextLine();
		CharStack cs;
		for(int i=0; i<totalInputs; i++){
			cs = new CharStack();
			String temp = sc.nextLine();
			int j;
			for(j=0; j<temp.length(); j++){
				if(temp.charAt(j) == '[' || temp.charAt(j) == '{' || temp.charAt(j) == '(')
					cs.push(temp.charAt(j));
				else if((temp.charAt(j) == '}' && cs.pop() == '{') || (temp.charAt(j) == ']' && cs.pop() == '[') || (temp.charAt(j) == ')' && cs.pop() == '('))
					continue;
				else 
					break;
			}
			if(j==temp.length())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

}
