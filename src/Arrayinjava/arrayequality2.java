package Arrayinjava;

public class arrayequality2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,4,5,7,7};
		int b [] = {1,2,3,4,5,6,7};
		
		boolean status = true;
		
		/*if(a.length!=b.length) {
			status = false;
		}*/
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=b[i]) {
				status = false;
			}
		}
		if(status) {
			System.out.println("Array is Equal");
		}
		else
		{
			System.out.println("Array is not Equal");
		}
	}

}
