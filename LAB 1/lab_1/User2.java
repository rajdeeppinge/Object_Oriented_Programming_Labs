package lab_1;

import java.util.Random;

public class User2 {
	private static final int MAX_MESSAGE_LENGTH = 100;
	static int autoID=0;
	private int userID;
	private ChatRoom2 assignedChatRoom;
	
	public User2(ChatRoom2 cr){
		autoID++;
		userID=autoID;
		assignedChatRoom=cr;
	}
	
	public void writeMessage(){
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		String message="[" + userID + "] ";
		Random messageRandomization=new Random();
		int messageLength = 1+messageRandomization.nextInt(MAX_MESSAGE_LENGTH);
		for(int i=0; i<messageLength; i++){
			message+= alphabet.charAt(messageRandomization.nextInt(alphabet.length()));
		}
		assignedChatRoom.receiveMessage(message);
	}
}
