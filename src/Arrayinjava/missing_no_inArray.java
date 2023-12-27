package Arrayinjava;

public class missing_no_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,4,6};
		
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1 = sum1+a[i];
			}
		int sum2=0;
		for(int i=0;i<=6;i++) {
			sum2=sum2+i;
		}
		System.out.println("missing element is "+(sum2-sum1));
	}

}
