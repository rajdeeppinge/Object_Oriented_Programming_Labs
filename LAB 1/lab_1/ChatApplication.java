package lab_1;

public class ChatApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom cr = new ChatRoom(); // an object of type Chatroom called "cr" is created. How? (inside ChatRoom.java)
        User u1 = new User(cr); // an object of type User called "u1" created. How? (inside User.java)
        User u2 = new User(cr); // another object of type User called "u2" is created.
        int conversationLength = 510; // What happens next?
        for (int i = 0; i < conversationLength; i++) {
            u1.writeMessage(); // ?
            u2.writeMessage(); // ?
        }
       // if( conversationLength < 510)
        	cr.printLog(); // chat room starts the log printing behavior
        /*else{
        	cr.printLog();
        	System.out.println("STOP");
        }*/
	}

}
