package lab_3;

public class User3 {
	public static final int MAX_CHAT = 10;
	private String name;
	private String[] sentMessages = new String[MAX_CHAT];
	private String[] receivedMessages = new String[MAX_CHAT];
	private int totalSent = 0;
	private int totalReceived = 0;
	private ChatRoom3 ac;
	
	public User3(String name, ChatRoom3 cr){
		this.name = name;
		ac = cr;
	}

	public String getName() {
		return name;
	}
	
	public void printSentMsg(){
		for(int i=0; i<totalSent; i++){
			System.out.println(sentMessages[i]);
		}
	}
	
	public void printReceivedMsg(){
		for(int i=0; i<totalReceived; i++){
			System.out.println(receivedMessages[i]);
		}
	}
	
	public void writeMessage(String message, User3 u2){
		sentMessages[totalSent++] = u2.name + ": " +message;
		ac.transferMessage(message, u2, this);
	}
	
	public void receiveMessage(String message){
		receivedMessages[totalReceived++] = message;
	}
}
