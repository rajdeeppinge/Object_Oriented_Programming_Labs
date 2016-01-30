package lab_3;

public class User {
	private String name;
	private String[] received = new String[1000];
	private String[] sent = new String[1000];
	private int totalReceived = 0;
	private int totalSent = 0;
	
	public String[] getReceived() {
		return received;
	}
	public void setReceived(String receive) {
		received[totalReceived] = receive;
		totalReceived++;
	}
	public String[] getSent() {
		return sent;
	}
	public void setSent(String send) {
		sent[totalSent] = send;
		totalSent++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printLog(){
		System.out.println(this.getName() + "'s sent messages:");
		for(int i=0; i<totalSent; i++){
			System.out.println(sent[i]);
		}
		System.out.println();
		System.out.println(this.getName() + "'s received messages:");
		for(int i=0; i<totalReceived; i++){
			System.out.println(received[i]);
		}
	}
}
