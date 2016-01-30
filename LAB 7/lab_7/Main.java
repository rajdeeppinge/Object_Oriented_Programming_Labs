package lab_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QueueStack<Integer> queue = new QueueStack<Integer>();
		for(int i=0; i<4; i++)
			queue.enqueue(sc.nextInt());
		for(int i=0; i<5; i++){
			System.out.println(queue.dequeue());
		}
		
		QueueLinkedList<Integer> LQ = new QueueLinkedList<Integer>();
		for(int i=0; i<4; i++)
			LQ.enqueue(sc.nextInt());
		for(int i=0; i<5; i++){			
			System.out.println(LQ.dequeue());
		}
		sc.close();
	}

}
