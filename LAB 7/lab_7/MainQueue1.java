package lab_7;

import java.util.Scanner;

public class MainQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements to be entered in queue 1");
		int size = sc.nextInt();
		QueueStack1<Integer> que = new QueueStack1<Integer>(size);
		for(int i=0; i<size; i++)
			que.enqueue(sc.nextInt());
		for(int i=0; i<size+1; i++)
			System.out.println(que.dequeue());
		System.out.println("Enter no of elements to be entered in queue 2");
		size = sc.nextInt();
		QueueLinkedList1<Integer> qq = new QueueLinkedList1<Integer>();
		for(int i=0; i<size; i++)
			qq.enqueue(sc.nextInt());
		for(int i=0; i<size +1; i++)
			System.out.println(qq.dequeue());
		sc.close();
	}
}
