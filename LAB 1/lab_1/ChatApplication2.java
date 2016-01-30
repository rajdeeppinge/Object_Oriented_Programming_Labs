package lab_1;

public class ChatApplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom2 cr= new ChatRoom2();
		User2 u1 = new User2(cr);
		User2 u2 = new User2(cr);
		int conversationLength=1010;
		for(int i=0; i<conversationLength; i++){
			u1.writeMessage();
			u2.writeMessage();
		}
		cr.printLog();
	}
}
