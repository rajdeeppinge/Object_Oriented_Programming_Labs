package lab_3;

public class ChatRoom2 {
	User2 users[];
	
	public ChatRoom2(String[] friends){
		users = new User2[friends.length];
		for(int i=0; i<friends.length; i++)
			users[i] = new User2(friends[i], this);
	}
	
	public void transferMessage(String message, User2 u2){
		u2.receiveMessage(message);
	}
	
	public User2 getUserReference(String friend){
		for (int i = 0; i < users.length; i++) {
            if (users[i].getFriend().equals(friend)) {
                return users[i];
            }
        }
        return null;

	}
}
