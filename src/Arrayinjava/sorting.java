package Arrayinjava;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,4,5,6,7,8,9,11,10};
		boolean isSorted = false;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1]) 
			{
				isSorted=true;
			}
			else
			{
				isSorted = false;
			}
		}
		if(isSorted==true)
		{
			System.out.println("Array is Sorted");
		}else
		{
			System.out.println("Array is not Sorted");
		}

	}

}
