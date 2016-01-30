package lab_3;

import java.util.Scanner;

public class ChatApplication4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] scannedInfo = new String[100];
		String[] names = sc.nextLine().split(" ");
		ChatRoom4 cr = new ChatRoom4(names);
		int i=0;
		
		do{
			scannedInfo[i] = sc.nextLine();
			String[] tofromMsg = scannedInfo[i].split(" ");
			if(tofromMsg.length == 3){

			//	String[] users = tofromMsg[0].split(" ");
				User4 fromUser = cr.getUserReference(tofromMsg[0]);
				User4 toUser = cr.getUserReference(tofromMsg[1].split(":")[0]);
				String message = tofromMsg[2];
				fromUser.writeMessage(message, toUser);
			}
			else{
				User4 queryUser;
				queryUser = cr.getUserReference(scannedInfo[i]);
				if(queryUser == null)
					break;
				System.out.println(queryUser.getName() + "'s sent messages");
				queryUser.printSentMessages();
				System.out.println();
				System.out.println(queryUser.getName() + "'s received messages");
				queryUser.printReceivedMessages();
			}
		}while(scannedInfo[i-1].length() > 0);
		
		sc.close();
	}
}
