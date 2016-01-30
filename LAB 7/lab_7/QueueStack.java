package lab_7;

import java.util.Stack;

public class QueueStack<T> {
	private Stack<T> st1 = new Stack<T>();
	private Stack<T> st2 = new Stack<T>();
	
	public void enqueue(T element){
		st1.push(element);
	}
	
	public T dequeue(){
		while(!st1.isEmpty())
			st2.push(st1.pop());
		if(st2.isEmpty())
			return null;
		T temp = st2.pop();
		while(!st2.isEmpty())
			st1.push(st2.pop());
		return temp;
	}
}
