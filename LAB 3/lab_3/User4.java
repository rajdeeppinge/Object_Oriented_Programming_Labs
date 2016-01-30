package lab_3;

public class User4 {
	public static final int MAX_CHAT = 10;
	private String name;
	private String[] sentMessages = new String[MAX_CHAT];
	private String[] receivedMessages = new String[MAX_CHAT];
	private int totalSent = 0;
	private int totalReceived = 0;
	private ChatRoom4 as;
	
	public User4(String name, ChatRoom4 cr){
		this.name=name;
		as=cr;
	}
	
	public String getName() {
		return name;
	}
	
	public void writeMessage(String message, User4 toUser){
		sentMessages[totalSent++] = toUser.name + ": " + message;
		as.transferMessage(message, toUser, this);
	}
	
	public void receiveMessage(String message){
		receivedMessages[totalReceived++] = message;
	}
	
	public void printSentMessages(){
		for(int i=0; i<totalSent; i++){
			System.out.println(sentMessages[i]);
		}
	}
	
	public void printReceivedMessages(){
		for(int i=0; i<totalReceived; i++){
			System.out.println(receivedMessages[i]);
		}
	}
}
