package lab_3;

import java.util.Scanner;

public class ChatApplication1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String scannedInfo[] = new String[100];
		User1 u[] = new User1[100];
		int i=0;
		int users = 0;	//to store total no of users
		do{
			scannedInfo[i] = sc.nextLine();
			if(i==0){											//splitting first line to store names of all the users
				String storeNames[] = scannedInfo[i].split(" ");
				users = storeNames.length;
				for(int j=0; j<users; j++){
					u[j] = new User1();
					u[j].setName(storeNames[j]);
				}
			}
			else if(scannedInfo[i].split(" ").length == 1){  	//to print chat history of a particular user we only give the name of the user which has length = 1
				for(int j=0; j<users; j++)
					if(u[j].getName().equals(scannedInfo[i])) 	
						u[j].printLog();						//if we find the user whose chat history is needed then we call printLog to print chat history 
			}
			else{
				String splitNamesAndMessage[] = scannedInfo[i].split(": ");  						//here according to the message format User1 User2: message we split the input as "User1 User2" and "message"
				String splitNamesBeforeStoringMessage[] = splitNamesAndMessage[0].split(" "); 		//splitNamesAndMessage[0] contains the String of type "User1 User2" hence we use this array to split those names
				for(int k=0; k<users; k++)
					for(int j=0; j<users; j++){
						if(splitNamesBeforeStoringMessage[0].equals(u[k].getName()) & 				//sender's name is stored in splitNamesBeforeStoringMessage[0]
								splitNamesBeforeStoringMessage[1].equals(u[j].getName())){ 			//receiver's name is stored in splitNamesBeforeStoringMessage[1]
							u[k].setSentMessage(u[j].getName()+": " + splitNamesAndMessage[1]); 	//storing message in sender's sent Messages in the REQUIRED FORMAT "User.name: message"
							u[j].setReceivedMessage(u[k].getName()+": " + splitNamesAndMessage[1]); //storing message in receiver's received Messages in the REQUIRED FORMAT "User.name: message"
						}
					}
			}
			i++;
		}
		while(!scannedInfo[i-1].equals("chat ends"));	//terminating condition
		sc.close();
	}
}
