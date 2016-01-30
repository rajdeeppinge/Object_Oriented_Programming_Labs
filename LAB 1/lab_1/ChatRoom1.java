package lab_1;

public class ChatRoom1 {
	private static int MAX_CHAT_LOGS = 1000;
	private String[] chatLogs = new String[MAX_CHAT_LOGS];
	private int totalChats;
	
	public void receiveUserChat(String message){
		chatLogs[totalChats%MAX_CHAT_LOGS]=message;
		totalChats++;
	}
	
	public void printLog(){
		if(totalChats < MAX_CHAT_LOGS){
			System.out.println("Running for 1th time");
			for(int i=0; i<totalChats; i++)
				System.out.println(chatLogs[i]);
		}
		else{
			for(int i=totalChats%MAX_CHAT_LOGS; i < MAX_CHAT_LOGS; i++){
				System.out.println(chatLogs[i]);
			}
			System.out.println("Running for " + (totalChats/MAX_CHAT_LOGS+1) + "th time");
			for(int i=0; i<totalChats%MAX_CHAT_LOGS; i++){
				System.out.println(chatLogs[i]);
			}
		}
	}
}
