package lab_1;

import java.util.Random;

public class User1 {
	static int autoID = 0;
	private int userID;
	private static final int MAX_MESSAGE_LENGTH = 100;
	private ChatRoom1 assignedChatRoom;
	
	public User1(ChatRoom1 cr){
		autoID++;
		userID=autoID;
		assignedChatRoom = cr;
	}
	
	public void writeMessage(){
		String alphabet = "qwertyuioplkjhgfdsazxcvbnm";
		String message = "[" + userID + "] ";
		Random messageRandomization = new Random();
		int messageLength = 1+ messageRandomization.nextInt(MAX_MESSAGE_LENGTH); // MESSAGE LENGTH is between 1 and 100
		for(int i=0; i<messageLength; i++){
			message+= alphabet.charAt(messageRandomization.nextInt(alphabet.length()));
		}
		assignedChatRoom.receiveUserChat(message);
	}
}
