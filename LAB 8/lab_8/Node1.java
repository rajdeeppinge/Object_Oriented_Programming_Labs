package lab_8;

public class Node1 {
	private Node1 left;
	private Employee1 data;
	private Node1 right;
	
	public Node1(Employee1 newEmployee){
		data = newEmployee;
		left = right = null;
	}
	
	public Node1 getLeft() {
		return left;
	}
	public void setLeft(Node1 left) {
		this.left = left;
	}
	public Employee1 getData() {
		return data;
	}
	public void setData(Employee1 data) {
		this.data = data;
	}
	public Node1 getRight() {
		return right;
	}
	public void setRight(Node1 right) {
		this.right = right;
	}
}
