package lab_8;

public class AddAndSearch1 {
	private Node1 head;
	private Node1 curr;
	
	public AddAndSearch1(){
		head = curr = null;
	}
	
	public void addEmployee(Employee1 newEmployee){
		Node1 newNode = new Node1(newEmployee);
		if(head == null){
			head = newNode;
		}
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
				else if(newEmployee.getSalary() < curr.getData().getSalary()){
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
			if(newEmployee.getTenure() > curr.getData().getTenure()){
				curr.setRight(newNode);
			}
			else if(newEmployee.getTenure() < curr.getData().getTenure()){
				curr.setLeft(newNode);
			}
			else if(newEmployee.getSalary() > curr.getData().getSalary()){
				curr.setRight(newNode);
			}
			else{
				curr.setLeft(newNode);
			}
		}
	}
	
	public Employee1[] searchEmployee(int tenure, int salary){
		Employee1 query[] = new Employee1[100];
		int count = 0;
		curr = head;
		while(curr != null){
			if(curr.getData().getTenure() == tenure && curr.getData().getSalary() == salary){
				query[count++] = curr.getData();
				curr = curr.getLeft();
			}
			else if(tenure > curr.getData().getTenure())
				curr = curr.getRight();
			else if(tenure < curr.getData().getTenure())
				curr = curr.getLeft();
			else if(salary > curr.getData().getSalary())
				curr = curr.getRight();
			else if(salary < curr.getData().getSalary())
				curr = curr.getLeft();
		}
		return query;
	}
}
