package mealBox;

public class Mother1 {
	private int johnRollNo;
	private int totalStudents;
	private int time;
	private int initialPos;
	
	public Mother1(int johnRollNo, int totalStudents){
		this.johnRollNo = johnRollNo;
		this.totalStudents = totalStudents;
		initialPos = -1;
	}
	
	public int timeTaken(SchoolKid1[] students){
		int lowIndex = 0;
		int highIndex = totalStudents - 1;
		time = 3;
		while(lowIndex < highIndex){
			int lowIndexRollNo = students[lowIndex].getRollNo();
			if(lowIndexRollNo == johnRollNo){
				initialPos = lowIndex + 1;
				break;
			}
			
			int mid = (lowIndex + highIndex + 1)/2;
			
			time += 3;
			
			int midRollNo = students[mid].getRollNo();
			if(midRollNo == johnRollNo){
				initialPos = mid + 1;
				break;
			}
			
			if(lowIndexRollNo < midRollNo){
				if(johnRollNo > lowIndexRollNo && johnRollNo < midRollNo)
					highIndex = mid - 1;
				else
					lowIndex = mid;
			}
			else{
				if(johnRollNo > lowIndexRollNo)
					highIndex = mid - 1;
				else
					lowIndex = mid;
			}
		}
		return time;
	}
	
	public int finalPosition(int shiftTime, int shiftPos){
		int finalPos;
		int iterations = time/shiftTime;
		finalPos = initialPos - shiftPos*iterations;
		if(finalPos <= 0)
			finalPos += totalStudents;
		return finalPos;
	}
}
