package mealBox;

public class Mother2 {
	final int totalStudent = 20;
	private int johnRollNo;
	int initialPosition;
//	private SchoolKid students;
	int low=0;
	int high=19;
	int mid;
	int totalTime=3;
	int finalPosition;
	
	public Mother2(int johnRollNo){
		this.johnRollNo = johnRollNo;
	}
	
	public int totalTime(SchoolKid a[]){
		while(true){
			int lowRN,midRN;
			mid = low+high+1>>>1;//Binary Increment to the r8 (Short way to find mid)
				if((lowRN=a[low].getRollNo()) ==johnRollNo)
				{
					initialPosition=low+1;
					break;
					}
				totalTime += 3;
				
				if((midRN=a[mid].getRollNo())==johnRollNo)
				{
					initialPosition=mid+1;
					break;
					}
				
				if(lowRN<midRN){
					if(johnRollNo>lowRN && johnRollNo<midRN)
						high=mid;
					else
						low=mid;
				}
				
				else{
					if(johnRollNo>midRN){
						if(johnRollNo > lowRN)
							high=mid;
						else
							low=mid;
					}
					else
						high=mid;
				}  
		}
		return totalTime;	
	}	
		
		public int finalPosition() {
			int c = totalTime/5;
			finalPosition = initialPosition - 4*c;
				if(finalPosition <= 0)
					finalPosition = 20 + finalPosition;
				
				return finalPosition;
		}
}
