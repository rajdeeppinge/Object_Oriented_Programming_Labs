package lab_3;

import java.util.Scanner;

public class ChatApplication3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String scannedInfo[] = new String[100];
		String friends[] = sc.nextLine().split(" ");
		ChatRoom3 cr = new ChatRoom3(friends);
		int i=0;
		
		do{
			scannedInfo[i] = sc.nextLine();
			if(scannedInfo[i].split(" ").length == 1){
				User3 queryUser = cr.getUserReference(scannedInfo[i]);
				if(queryUser == null)
					break;
				System.out.println(scannedInfo[i] + "'s sent messages");
				queryUser.printSentMsg();
				System.out.println();
				System.out.println(scannedInfo[i] + "'s received messages");
				queryUser.printReceivedMsg();
			}
			else{
				String[] tofromMsg = scannedInfo[i].split(": ");
				String[] users = tofromMsg[0].split(" ");
				String from = users[0];
				String to = users[1];
				String message = tofromMsg[1];
				User3 fromUser = cr.getUserReference(from);
				User3 toUser = cr.getUserReference(to);
				fromUser.writeMessage(message, toUser);
			}
			i++;
		}while(!scannedInfo[i-1].equals("exit"));
		
		sc.close();
	}

}
