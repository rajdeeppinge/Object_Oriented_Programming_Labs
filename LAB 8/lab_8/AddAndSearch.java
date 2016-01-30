package lab_8;

public class AddAndSearch {
	private Node head;
	private Node curr;
	
	public AddAndSearch(){
		head = curr = null;
	}
	
	public void addEmployee(Employee newEmployee){
		Node newNode = new Node(newEmployee);
		if(head == null){		//if array is empty, newEmployee is at the head
			head = newNode;
		}
		else{
			curr = head;
			while(curr.getLeft() != null || curr.getRight() != null){		//run the loop till leaf node is reached
				if(newEmployee.getTenure() > curr.getData().getTenure()){
					if(curr.getRight() == null)			//the element has greater tenure than curr so it will be stored on right side. If right side of curr is empty then break loop and store element then and there, else go to right side of curr.
						break;
					else
						curr = curr.getRight();
				}
				else if(newEmployee.getTenure() < curr.getData().getTenure()){
					if(curr.getLeft() == null)			//similar to above comment
						break;
					else
						curr = curr.getLeft();
				}
				else if(newEmployee.getSalary() > curr.getData().getSalary()){
					if(curr.getRight() == null)			//the element has greater salary than curr so it will be stored on right side. If right side of curr is empty then break loop and store element then and there, else go to right side of curr.
						break;
					else
						curr = curr.getRight();
				}
				else if(newEmployee.getSalary() < curr.getData().getSalary()){
					if(curr.getLeft() == null)			//similar to above comment
						break;
					else
						curr = curr.getLeft();
				}
				else if(curr.getLeft() != null)			//if both tenure and salary are equal then element should be stored on the left side of curr but if left side is not empty go to the node on left
					curr = curr.getLeft();
				else
					break;
			}
			//after coming out of loop we are at a node whose at least one side is null and the element is required to be added on that side only
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
				curr.setLeft(newNode);		//if salary of newEmployee is less OR both salary and tenure of newEmployee are equal to curr's, we must add it to the left of curr
			}
		}
	}
	
	public Employee[] searchEmployee(int tenure, int salary){
		Employee[] query = new Employee[100];
		int count = 0;
		curr = head;
		while(curr != null){					//run the loop till the tree is not traversed completely
			if(tenure == curr.getData().getTenure() && salary == curr.getData().getSalary()){
				query[count++] = curr.getData();			//if required condition is met and the employee is found store it in array
				curr = curr.getLeft();					//if another such matching element is present then it will be on the LHS of the curr because we store it in such way
	//			count++;
			}
			else if(tenure > curr.getData().getTenure())		//if tenure to be searched > curr.tenure search it on the right side of curr
				curr = curr.getRight();
			else if(tenure < curr.getData().getTenure())		//similar to above comment
				curr = curr.getLeft();
			else if(salary > curr.getData().getSalary())		//similar to above comment
				curr = curr.getRight();
			else if(salary < curr.getData().getSalary())		//similar to above comment
				curr = curr.getLeft(); 
		}
		return query;
	}
}