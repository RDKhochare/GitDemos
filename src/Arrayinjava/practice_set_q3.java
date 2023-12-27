package Arrayinjava;

public class practice_set_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks [] = {1,2,3,4,5,6,7,8,9};
		int sum =0,avg_marks = 0;
		for(int values:marks) {
		sum += values;
		avg_marks = sum/marks.length;
		
		}
		System.out.println("Avg marks is:"+avg_marks);
	}

}
