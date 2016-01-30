package lab_8;

public class SortAndSearch {
	private Node head;
	private Node curr;
	
	public SortAndSearch(){
		head = curr = null;
	}
	
	public void addEmployee(Employee emp){
		Node temp = new Node(emp);
		if(head == null)
			head = temp;
		else{
			curr = head;
			while(curr.getLeft() != null && curr.getRight() != null){
				if(emp.getTenure() > curr.getData().getTenure()){
					if(curr.getRight() == null)
						break;
					curr = curr.getRight();
				}
				else if(emp.getTenure() < curr.getData().getTenure()){
					if(curr.getLeft() == null)
						break;
					curr = curr.getLeft();
				}
				else if(emp.getSalary() > curr.getData().getSalary() && curr.getRight() != null){
					if(curr.getRight() == null)
						break;
					curr = curr.getRight();
				}
				else if(emp.getSalary() < curr.getData().getSalary() && curr.getLeft() != null){
					if(curr.getLeft() == null)
						break;
					curr = curr.getLeft();
				}
				else if(curr.getLeft() != null)
					curr = curr.getLeft();
				else
					break;
			}
			if(emp.getTenure() > curr.getData().getTenure())
				curr.setRight(temp);
			else if(emp.getTenure() < curr.getData().getTenure())
				curr.setLeft(temp);
			else if(emp.getSalary() > curr.getData().getSalary())
				curr.setRight(temp);
			else
				curr.setLeft(temp);
		}
	}
	
	public Employee[] searchEmployee(int tenure, int salary){
		curr = head;
		int count = 0;
		Employee[] matching = new Employee[100];
		while(curr != null){
			if(curr.getData().getTenure() == tenure && curr.getData().getSalary() == salary){
				matching[count++] = curr.getData();
	//			System.out.println(curr.getData().getId());
				curr = curr.getLeft();
			}
			else if(tenure > curr.getData().getTenure())
				curr = curr.getRight();
			else if(tenure < curr.getData().getTenure())
				curr = curr.getLeft();
			else if(salary > curr.getData().getSalary())
				curr = curr.getRight();
			else
				curr = curr.getLeft();
		}
		return matching;	
	}
}