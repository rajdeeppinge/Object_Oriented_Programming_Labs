	package lab_3;

public class User2 {
	public static final int MAX_CHAT = 10;
	private String[] sentMessages = new String[MAX_CHAT];
	private String[] receivedMessages = new String[MAX_CHAT];
	private int totalSent = 0;
	private int totalReceived = 0;
	private ChatRoom2 assignedChatRoom;
	private String friend;
	
	public User2(String friend, ChatRoom2 cr){
		this.friend = friend;
		assignedChatRoom = cr;
	}
	
	public void writeMessage(String message, User2 u2){
		sentMessages[totalSent++] = message;
		assignedChatRoom.transferMessage(message, u2);
	}
	
	public void receiveMessage(String message){
		receivedMessages[totalReceived++] = message;
	}
	
	public void printSentMessages(){
		for(int i=0; i<totalSent; i++)
			System.out.println(sentMessages[i]);
	}
	
	public void printReceivedMessages(){
		for(int i=0; i<totalReceived; i++)
			System.out.println(receivedMessages[i]);
	}

	public String getFriend() {
		return friend;
	}
}
