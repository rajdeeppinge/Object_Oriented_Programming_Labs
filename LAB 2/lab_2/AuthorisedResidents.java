package lab_2;

public class AuthorisedResidents extends Residents {

	public void olderThanMe(AuthorisedResidents ar[], int i){
		if(this.sex.equals("female") && this.authority.equals("yes")){
			int m=0,counter=0;
			while(m<i){
				if(ar[m].getAge() > this.getAge()){
					counter++;
				}
				m++;
			}
			System.out.println(counter);
		}
	}
	
	public void oldestMale(AuthorisedResidents ar[], int i){
		if(this.sex.equals("male") && this.authority.equals("yes")){
			int m=0,maxage=0;
			while(m<i){
				if(ar[m].getSex().equals("male") && ar[m].getAge()>maxage){
					maxage=ar[m].getAge();
				}
				m++;
			}
			System.out.println(maxage);
		}
	}
	
	public void wantName(String add, AuthorisedResidents ar[], int i){
		if(this.age<18 && this.authority.equals("yes")){
			int m=0;
			while(m<i){
				if(add.equals(ar[m].getAddress())){
					System.out.println(ar[m].getName());
					break;
				}
				else
					m++;
			}
		}
	}
}
