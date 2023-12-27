package Arrayinjava;

public class practice_set_q5_ArrayReverse_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,4,5,6,7,8,9};
		int l=a.length;
		int n = l/2;
		int temp=0;
		for(int i =0;i<n;i++) {
			temp = a[i];
			a[i] = a[l-i-1];
			a[l-i-1]=temp;
		}
		for(int element:a) {
			System.out.println(element);
		}
	}

}
