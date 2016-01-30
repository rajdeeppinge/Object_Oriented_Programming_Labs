package lab_8;

public class Node2 {
	private Node2 left;
	private Employee2 data;
	private Node2 right;
	
	public Node2(Employee2 newEmployee){
		data = newEmployee;
		left = right = null;
	}

	public Node2 getLeft() {
		return left;
	}

	public void setLeft(Node2 left) {
		this.left = left;
	}

	public Employee2 getData() {
		return data;
	}

	public void setData(Employee2 data) {
		this.data = data;
	}

	public Node2 getRight() {
		return right;
	}

	public void setRight(Node2 right) {
		this.right = right;
	}
}