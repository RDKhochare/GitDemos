package Arrayinjava;

public class practice_set_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,598,6,7,8,9};
		int max =Integer.MIN_VALUE;
		for(int e :a) {
			if(e>max) {
				max=e;
			}
		}
		System.out.println("max element is:"+max);
	}

}
