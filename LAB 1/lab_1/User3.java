package lab_1;

import java.util.Random;

public class User3 {
	static int autoID=0;
	private int userID;
	private static final int MAX_MESSAGE_LENGTH=100;
	private ChatRoom3 assignedChatRoom;
	
	public User3(ChatRoom3 cr){
		autoID++;
		userID=autoID;
		assignedChatRoom=cr;
	}
	
	public void writeMessage(){
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		String message="[" + userID + "] ";
		Random messageRandomization=new Random();
		int messageLength = 1+messageRandomization.nextInt(MAX_MESSAGE_LENGTH);
		for(int i=0;i<messageLength;i++){
			message+=alphabet.charAt(messageRandomization.nextInt(alphabet.length()));
		}
		assignedChatRoom.receiveUserChat(message);
	}
}
