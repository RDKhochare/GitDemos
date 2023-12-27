package Arrayinjava;

public class practice_set_q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,4,5,6,7,8,1};
		boolean isSorted = true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				isSorted=false;
				break;
			}
		}
		if(isSorted) 
		{
			System.out.println("Array is Sorted");
		}
		else
		{
			System.out.println("Array is not Sorted");
		}
	}

}
