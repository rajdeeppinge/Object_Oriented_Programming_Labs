package lab_1;

public class ChatApplication3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom3 cr= new ChatRoom3();
		User3 u1=new User3(cr);
		User3 u2=new User3(cr);
		
		int conversationLength=10;
		
		for(int i=0;i<conversationLength; i++){
			u1.writeMessage();
			u2.writeMessage();
		}
		
		cr.printLog();
	}
}
