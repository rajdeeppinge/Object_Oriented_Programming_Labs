import java.util.*;
public class Tester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int r,c;
		TTTBoard tb=new TTTBoard();
		ComputerLogicWithMMA pc=new ComputerLogicWithMMA();
	
		System.out.println("who will play first?");
		String first=sc.nextLine();
		int j=2;
		
		if(first.equals("user"))
			j=1;
		
		boolean draw=true;
		
		for(int i=j;i<j+9;i++){
			
			if(i%2==1){
				r=sc.nextInt()-1;
				c=sc.nextInt()-1;
				sc.nextLine();
				tb.userMove(r, c);
			}
			
			else
				pc.makeMove(tb);
					
			String s=tb.checkWinner();
			
			if(!s.equals("no one")){
				System.out.println(s + "wins");
				draw=false;
				break;
			}
		}
		
		if(draw)
			System.out.println("draw");

		sc.close();
	}
}
