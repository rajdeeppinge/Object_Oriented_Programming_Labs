package lab_2;

public class AuthorisedPerson1 {
	private String name;
	private String sex;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int elderThanMe(Person1[] resident, int totalResidents){
		int elder = 0;
		for(int i=0; i<totalResidents; i++){
			if(resident[i].getAge() > this.getAge())
				elder++;
		}
		return elder;
	}
	
	public int oldestMale(Person1[] resident, int totalResidents){
		int maxAge = this.getAge();
		for(int i=0; i<totalResidents; i++){
			if(resident[i].getSex().equals("male") & resident[i].getAge() > maxAge)
				maxAge = resident[i].getAge();
		}
		return maxAge;
	}
	
	public String getNameGivenAddress(Person1[] resident, int totalResidents, String address){
		for(int i=0; i<totalResidents; i++){
			if(resident[i].getAddress().equals(address))
				return resident[i].getName();
		}
		return null;
	}
}
