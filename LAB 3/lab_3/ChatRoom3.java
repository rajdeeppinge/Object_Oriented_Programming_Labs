package lab_3;

public class ChatRoom3 {
	User3 users[];
	
	public ChatRoom3(String[] names){
		users = new User3[names.length];
		for(int i=0; i<names.length; i++){
			users[i] = new User3(names[i], this);
		}
	}
	
	public void transferMessage(String message, User3 u2, User3 fromUser){
		u2.receiveMessage(fromUser.getName() + ": " +message);
	}
	
	public User3 getUserReference(String user){
		for(int i=0; i<users.length; i++){
			if(users[i].getName().equals(user))
				return users[i];
		}
		return null;
	}
}
