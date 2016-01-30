package lab_3;

public class ChatRoom {
	private static final int MCL = 100;
	private String[] chatLogs = new String[MCL];
	private int totalChats = 0;
	
	public void receiveMessage(String message){
		chatLogs[totalChats % MCL] = message;
		totalChats++;
	}
	
	public void printLog(){
		for(int i=0; i<MCL; i++){
			System.out.println(chatLogs[totalChats]);
		}
	}
}
