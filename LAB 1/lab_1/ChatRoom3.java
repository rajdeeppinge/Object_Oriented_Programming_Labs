package lab_1;

public class ChatRoom3 {
	private static final int MAX_CHAT_LOGS=1000;
	private String[] chatLogs=new String[MAX_CHAT_LOGS];
	private int totalChats=0;
	
	public void receiveUserChat(String message){
		chatLogs[totalChats%MAX_CHAT_LOGS]=message;
		totalChats++;
	}
	
	public void printLog(){
		if(totalChats >= MAX_CHAT_LOGS){
			for(int i=totalChats%MAX_CHAT_LOGS;i<MAX_CHAT_LOGS;i++)
				System.out.println(chatLogs[i]);
		}
		System.out.println("cycled for " + (totalChats/MAX_CHAT_LOGS) + "th time");
		for(int i=0; i<totalChats%MAX_CHAT_LOGS; i++)
			System.out.println(chatLogs[i]);
	}
}
