package lab_7;

import java.util.Scanner;

public class MainQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		QueueStack2<Integer> qs = new QueueStack2<Integer>();
		for(int i=0; i<size; i++){
			qs.enqueue(sc.nextInt());
		}
		for(int i=0; i<size + 1; i++){
			System.out.println(qs.dequeue());
		}
		size = sc.nextInt();
		QueueLinkedList2<Integer> qll = new QueueLinkedList2<Integer>();
		for(int i=0; i<size; i++){
			qll.enqueue(sc.nextInt());
		}
		for(int i=0; i<size + 1; i++){
			System.out.println(qll.dequeue());
		}
		sc.close();
	}

}
