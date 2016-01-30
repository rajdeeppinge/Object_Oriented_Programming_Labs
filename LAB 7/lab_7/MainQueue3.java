package lab_7;

import java.util.Scanner;

public class MainQueue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in queue 1");
		int size = sc.nextInt();
		QueueStack3<Integer> qs = new QueueStack3<Integer>(size); 
		for(int i=0; i<size; i++)
			qs.enqueue(sc.nextInt());
		for(int i=0; i<size+1; i++)
			System.out.println(qs.dequeue());
		System.out.println("Enter the no of elements in queue 2");
		size = sc.nextInt();
		QueueLinkedList3<Integer> qll = new QueueLinkedList3<Integer>();
		for(int i=0; i<size; i++)
			qll.enqueue(sc.nextInt());
		for(int i=0; i<size+1; i++)
			System.out.println(qll.dequeue());
		sc.close();
	}

}
