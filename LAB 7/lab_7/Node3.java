package lab_7;

public class Node3<T> {
	private T data;
	private Node3<T> next;
	
	public Node3(T data) {
		this.data = data;
		next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node3<T> getNext() {
		return next;
	}

	public void setNext(Node3<T> next) {
		this.next = next;
	}
}
