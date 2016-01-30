package lab_8;

public class AddAndSearch2 {
	private Node2 head;
	private Node2 curr;
	
	public AddAndSearch2(){
		head = curr = null;
	}
	
	public void addEmployee(Employee2 newEmployee){
		Node2 newNode = new Node2(newEmployee);
		if(head == null)
			head = newNode;
		else{
			curr = head;
			while(curr.getLeft() != null || curr.getRight() != null){
				if(newEmployee.getTenure() > curr.getData().getTenure()){
					if(curr.getRight() == null)
						break;
					else
						curr = curr.getRight();
				}
				else if(newEmployee.getTenure() < curr.getData().getTenure()){
					if(curr.getLeft() == null)
						break;
					else
						curr = curr.getLeft();
				}
				else if(newEmployee.getSalary() > curr.getData().getSalary()){
					if(curr.getRight() == null)
						break;
					else
						curr = curr.getRight();
				}
				else if(newEmployee.getTenure() > curr.getData().getTenure()){
					if(curr.getLeft() == null)
						break;
					else
						curr = curr.getLeft();
				}
				else if(curr.getLeft() != null)
					curr = curr.getLeft();
				else
					break;
			}
			if(newEmployee.getTenure() > curr.getData().getTenure())
				curr.setRight(newNode);
			else if(newEmployee.getTenure() < curr.getData().getTenure())
				curr.setLeft(newNode);
			else if(newEmployee.getSalary() > curr.getData().getSalary())
				curr.setRight(newNode);
			else
				curr.setLeft(newNode);
		}
	}
	
	public Employee2[] searchEmployee(int tenure, int salary){
		Employee2[] query = new Employee2[100];
		int count = 0;
		curr = head;
		while(curr != null){
			if(tenure == curr.getData().getTenure() && salary == curr.getData().getSalary()){
				query[count++] = curr.getData();
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
		return query;
	}
}
