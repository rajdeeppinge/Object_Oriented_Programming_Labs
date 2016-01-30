package lab_7;

public class QueueLinkedList3<T> {
	private Node3<T> head;
	private Node3<T> tail;
	
	public QueueLinkedList3(){
		head = tail = null;
	}
	
	public void enqueue(T data){
		Node3<T> newNode = new Node3<T>(data);
		if(isEmpty())
			head = newNode;
		else
			tail.setNext(newNode);
		tail = newNode;
	}
	
	public T dequeue(){
		if(isEmpty())
			return null;
		T data = head.getData();
		head = head.getNext();
		if(head == null)
			tail = null;
		return data;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
}
