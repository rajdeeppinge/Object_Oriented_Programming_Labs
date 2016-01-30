package lab_3;

//import java.io.*;
import java.util.*;

public class ChatApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String info[] = new String[100];
		User[] u = new User[100];
		int i=0;
		int users = 0;
		
		do{
			info[i] = sc.nextLine();
			if(i==0){
				String arr[] = info[i].split(" ");
				users = arr.length;
				for(int j=0; j<users; j++){
					u[j] = new User();
					u[j].setName(arr[j]);
				}
			}
			
			else if(info[i].split(" ").length == 1){
				for(int j=0; j<users; j++){
					if(info[i].equals(u[j].getName()))
						u[j].printLog();
				}
			}
			
			else{
				String arr1[] = info[i].split(": ");
				String arr2[] = arr1[0].split(" ");
				//System.out.println(arr2[0] + " " + arr2[1]);
				for(int k=0; k<users; k++){
					for(int j=0; j<users; j++){
						if(arr2[0].equals(u[k].getName()) & arr2[1].equals(u[j].getName())){
							u[k].setSent(u[j].getName() + ": " + arr1[1]);
							u[j].setReceived(u[k].getName() + ": " + arr1[1]);
						}
					}
				}
			}
			i++;
		}
		while(!info[i-1].equals("chat ends"));
		sc.close();
	}
}