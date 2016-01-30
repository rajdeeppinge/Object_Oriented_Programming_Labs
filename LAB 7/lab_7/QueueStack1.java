package lab_7;

import java.util.Stack;

public class QueueStack1<T> {
	private Stack<T> st1 = new Stack<T>();
	private Stack<T> st2 = new Stack<T>();
	
	public QueueStack1(int minSize){
		st1.ensureCapacity(minSize);
		st2.ensureCapacity(minSize);
	}
	
	public void enqueue(T data){
		st1.push(data);
	}
	
	public T dequeue(){
		while(!st1.isEmpty())
			st2.push(st1.pop());
		if(st2.isEmpty())
			return null;
		T data = st2.pop();
		while(!st2.isEmpty())
			st1.push(st2.pop());
		return data;
	}
}
