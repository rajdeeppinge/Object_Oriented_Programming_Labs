package lab_3;

import java.util.*;

public class ChatApplication2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String scannedInfo[] = new String[100];
		String []friends = sc.nextLine().split(" ");
		ChatRoom2 cr = new ChatRoom2(friends);
	//	int i=0;
		
		while(sc.hasNext());{
	//		if(sc.equals("stop")){
	//			break;
	//		}
			if(!sc.nextLine().contains(" ")){
				String user = sc.next();
                User2 queryUser = cr.getUserReference(user);
                System.out.println(user+"'s sent messages:");
                queryUser.printSentMessages();
                System.out.println();
                System.out.println(user+"'s received messages:");
                queryUser.printReceivedMessages();     
			}				
			else{
				String from = sc.next();
                String to = sc.next().split(":")[0];
                String message = sc.nextLine();
                User2 fromUser = cr.getUserReference(from);
                User2 toUser = cr.getUserReference(to);
                fromUser.writeMessage(message, toUser);
			}
//			i++;
		}
		
	//	while(!scannedInfo[i-1].equals("exit"));
		
		sc.close();
	}
}
