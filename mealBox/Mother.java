package mealBox;

public class Mother {
	private final int johnRollNO;
	private int totalStudents;
	private int time;
	private int initialPos;
	
	public Mother(int johnRollNO, int totalStudents){
		this.johnRollNO = johnRollNO;
		this.totalStudents = totalStudents;
		time = 3;
		initialPos = -1;
	}
	
	public int timeTaken(SchoolKid[] student){
		int lowIndex = 0;
		int highIndex = totalStudents - 1;
		while(lowIndex < highIndex){
			int lowIndexRollNo = student[lowIndex].getRollNo();
			if(lowIndexRollNo == johnRollNO){
				initialPos = lowIndex + 1;
				break;
			}
			int mid = (lowIndex + highIndex + 1)/2;
			time += 3;
			int midRollNo = student[mid].getRollNo();
			if(midRollNo == johnRollNO){
				initialPos = mid + 1;
				break;
			}
			if(lowIndexRollNo < midRollNo){
				if(johnRollNO < midRollNo && johnRollNO > lowIndexRollNo)
					highIndex = mid-1;
				else
					lowIndex = mid;
			}
			else{
				if(johnRollNO > midRollNo){
					if(johnRollNO > lowIndexRollNo)
						highIndex = mid - 1;
					else
						lowIndex = mid;
				}
				else
					highIndex = mid;
			}
		}
		return time;
	}
	
	public int finalPosition(){
		int finalPos;
		int iterations = time/5;
		finalPos = initialPos - 4*iterations;
		if(finalPos <= 0)
			finalPos += totalStudents;
		return finalPos;
	}
}