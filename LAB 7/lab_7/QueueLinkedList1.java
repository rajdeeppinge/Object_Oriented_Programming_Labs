package lab_7;

public class QueueLinkedList1<T> {
	private Node1<T> head;
	private Node1<T> tail;
	
	public QueueLinkedList1(){
		head = null;
		tail = null;
	}
	
	public void enqueue(T data){
		Node1<T> newNode = new Node1<T>(data);
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
		return head==null;
	}
}
