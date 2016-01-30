package lab_5;

public class Employees3 {
	private int id;
	private String name;
	private int tenure;
	private int salary;
	
	public Employees3(int id, String name, int tenure, int salary) {
		this.id = id;
		this.name = name;
		this.tenure = tenure;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
