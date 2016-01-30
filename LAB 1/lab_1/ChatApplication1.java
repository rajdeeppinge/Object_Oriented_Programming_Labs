package lab_1;

public class ChatApplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom1 cr=new ChatRoom1();
		User1 u1=new User1(cr);
		User1 u2=new User1(cr);
		
		int conversationLength=499;
		
		for(int i=0; i<conversationLength; i++){
			u1.writeMessage();
			u2.writeMessage();
		}
		
		cr.printLog();
	}

}
