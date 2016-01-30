package lab_3;

public class ChatRoom4 {
	User4 users[];
	
	public ChatRoom4(String[] names){
		users = new User4[names.length];
		for(int i=0; i<names.length; i++){
			users[i] = new User4(names[i], this);
		}
	}
	
	public void transferMessage(String message, User4 toUser, User4 fromUser){
		toUser.receiveMessage(fromUser.getName() + ": " + message);
	}
	
	public User4 getUserReference(String user){
		for(int i=0; i<users.length; i++){
			if(users[i].getName().equals(user))
				return users[i];
		}
		return null;
	}
}
