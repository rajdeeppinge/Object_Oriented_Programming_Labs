package lab_7;

public class QueueLinkedList2<T> {
	private Node2<T> head;
	private Node2<T> tail;
	
	public QueueLinkedList2() {
		head = tail = null;
	}

	public void enqueue(T data){
		Node2<T> temp = new Node2<T>(data);
		if(isEmpty())
			head = temp;
		else
			tail.setNext(temp);
		tail = temp;
	}
	
	public T dequeue(){
		if(isEmpty())
			return null;
		T tempdata = head.getData();
		head = head.getNext();
		if(head == null)
			tail = null;
		return tempdata;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
}
