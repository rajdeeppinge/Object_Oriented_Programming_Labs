package lab_5;

import java.util.ArrayList;

public class Employees1 {
	private int id;
	private String name;
	private int tenure;
	private int salary;
	
	Employees1(int id, String name, int tenure, int salary){
		this.id = id;
		this.name = name;
		this.tenure = tenure;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getTenure() {
		return tenure;
	}

	public int getSalary() {
		return salary;
	}
	
	public static Employees1 searchEmployee(ArrayList<Employees1> records, int id){
		for(int i=0; i<records.size(); i++){
			if(records.get(i).getId() == id)
				return records.get(i);
		}
		return null;
	}
}
