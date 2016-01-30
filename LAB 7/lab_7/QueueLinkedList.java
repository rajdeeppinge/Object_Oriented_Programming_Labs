package lab_7;

public class QueueLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	
	public QueueLinkedList(){
		head = null;
		tail = null;
	}
	
	public void enqueue(T data){
		Node<T> newNode = new Node<T>(data);
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
		if(isEmpty())
			tail = null;
		return data;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
}
