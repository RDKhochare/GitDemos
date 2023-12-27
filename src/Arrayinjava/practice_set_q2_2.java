package Arrayinjava;

public class practice_set_q2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6,7,8,9};
		int b=19;
		boolean isinarray = true;
		
		
		for(int i=0;i<a.length;i++) 
		{ 
			if (a[i]==b)
			{
				isinarray = false;
				break;
			}
		}
		if (isinarray) {
			System.out.println("Present in not array");
		}
		else
		{
			System.out.println(" Present in array");
		}
	}
}
		/* boolean isInArray = false;
	        for(float element:a){
	            if(b==element){
	                isInArray = true;
	                break;
	            }
	        }
	        if(isInArray){
	            System.out.println("The value is present in the array");
	        }
	        else{
	            System.out.println("The value is not present in the array");
	        }
	}
}*/

