package lab_8;

public class Node {
	private Node left;
	private Employee data;
	private Node right;
	
	public Node(Employee data) {
		this.data = data;
		left = right = null;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
