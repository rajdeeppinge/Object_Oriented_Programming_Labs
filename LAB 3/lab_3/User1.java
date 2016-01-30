package lab_3;

public class User1 {
		private String name;
		private String[] receivedMessage = new String[100];
		private String[] sentMessage = new String[100];
		private int totalReceived = 0;
		private int totalSent = 0;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String[] getRm() {
			return receivedMessage;
		}
		public void setReceivedMessage(String received) {
			receivedMessage[totalReceived] = received;
			totalReceived++;
		}
		public String[] getSm() {
			return sentMessage;
		}
		public void setSentMessage(String sent) {
			sentMessage[totalSent] = sent;
			totalSent++;
		}
		
		public void printLog(){
			System.out.println(this.getName()+"'s sent messages:");
			for(int i=0; i<totalSent; i++)
				System.out.println(this.sentMessage[i]);
			System.out.println();
			System.out.println(this.getName()+"'s received messages:");
			for(int i=0; i<totalReceived; i++)
				System.out.println(this.receivedMessage[i]);
		}
}
