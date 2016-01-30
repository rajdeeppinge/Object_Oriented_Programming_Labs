
public class Mother {
		final int totalStudent = 23;
		private int johnRollNo;
		int initialPosition;
		private Student students;
		int low=0;
		int high=22;
		int mid;
		int totalTime=2;
		int finalPosition;
		
		public Mother(int johnRollNo){
			this.johnRollNo = johnRollNo;
		}
		
		public int totalTime(Student a[]){
			while(true){
				int lowRN,midRN;
				mid = low+high+1>>>1;//Binary Increment to the r8 (Short way to find mid)
					if((lowRN=a[low].getRollNo()) ==johnRollNo)
					{
						initialPosition=low+1;
						break;
						}
					totalTime += 2;
					
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
				int c = totalTime/4;
				finalPosition = initialPosition - 2*c;
					if(finalPosition <= 0)
						finalPosition = 23 + finalPosition;
					
					return finalPosition;
			}
}