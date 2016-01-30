package lab_2;

public class AuthorisedPerson2 {
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
	
	public String toString() {
        return "Name: "+this.getName()+"\nSex: "+this.getSex()+"\nAge: "+this.getAge()+"\nAddress: "+this.getAddress();
    }
	
	public int elderThanMe(Person2[] resident, int totalResidents){
		int elderCount = 0;
		for(int i=0; i<totalResidents; i++)
			if(resident[i].getAge() > this.getAge())
				elderCount++;
		return elderCount;
	}
	
	public int oldestMale(Person2[] resident, int totalResidents){
		int maxAge = this.getAge();
		for(int i=0; i<totalResidents; i++)
			if(resident[i].getSex().equals("male") & resident[i].getAge() > maxAge)
				maxAge = resident[i].getAge();
		return maxAge;
	}
	
	public String getNameGivenAddress(Person2[] resident, int totalResidents, String address){
		for(int i=0; i<totalResidents; i++)
			if(resident[i].getAddress().equals(address))
				return resident[i].getName();
		return null;
	}
}
