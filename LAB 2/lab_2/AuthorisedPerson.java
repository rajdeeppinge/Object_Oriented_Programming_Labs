package lab_2;

public class AuthorisedPerson {
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
	public void setAddress(String address){
		this.address = address;
	}
	
	public int elderThanMe(Person[] residents, int totalResidents){
		int elder=0;
		for(int i=0; i<totalResidents; i++){
			if(this.age < residents[i].getAge())
				elder++;
		}
		return elder;
	}
	
	public int oldestMaleAge(Person[] residents, int totalResidents){
		int maxAge = this.getAge();
		for(int i=0; i<totalResidents; i++){
			if(residents[i].getSex().equals("male") & maxAge < residents[i].getAge())
				maxAge = residents[i].getAge();
		}
		return maxAge;
	}
	
	public String getNameGivenAge(Person[] residents, int totalResidents, String address){
		for(int i=0; i<totalResidents; i++){
			if(residents[i].getAddress().equals(address)){
				return residents[i].getName();
			}
		}
		return null;
	}
	
    public String toString() {
        return "Name: "+this.getName()+"\nSex: "+this.getSex()+"\nAge: "+this.getAge()+"\nAddress: "+this.getAddress();
    }
}