package lab_1;

public class ChatRoom {
	private static int MAX_CHAT_LOGS = 1000; // The size of the log list is decided to be 1000.
    private String []chatLogs = new String[MAX_CHAT_LOGS]; //a 1000-sized array of String objects "chatLogs" is created.  
    private int totalChats=0,j=0,count=0;

    // Our ChatRoom has no defining attributes for now
    //public void ChatRoom() {
    //}

    // Store the user chat
    public void receiveUserChat(String message) {
// Fill out the method - explain your code (how do you make a ChatRoom object store the message?)
    	if(totalChats< MAX_CHAT_LOGS){
    		chatLogs[totalChats]=message; //Since totalChats starts from 0 we use it as an array index for storing received messages
    		totalChats++; //incrementing the totalChats as we have stored a message in chatLogs
    	}
    	else{
    		chatLogs[j]=message;
    		totalChats++;
    		j++;
    	}
    }

    // Retreive the chat logs
    public void printLog() {
        // Fill out the method - explain your code (how do you make this object retrieve the log?)
    	if(totalChats< MAX_CHAT_LOGS)
    		for(int i=0; i<totalChats; i++)
    			System.out.println(chatLogs[i]);
    	else{
    		for(int i = totalChats - MAX_CHAT_LOGS; i<MAX_CHAT_LOGS; i++,count++)
    			System.out.println(chatLogs[i]);
    		System.out.println(count);
    		System.out.println("reentering");
    		for(int i=0;i<totalChats - MAX_CHAT_LOGS;i++)
    			System.out.println(chatLogs[i]);
    	}
    }
}
