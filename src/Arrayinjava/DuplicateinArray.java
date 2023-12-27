package Arrayinjava;

public class DuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {9,2,3,4,5,6,1,5};
		boolean status = false;
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
			if(a[i]==a[j])
			{
				status =true;
			}
			}
		}
		
		if(status) {
			System.out.println("Duplicate element is present:");
		}
		else
		{
			System.out.println("Duplicate element is not present:");
		}
	}

}
