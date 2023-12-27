package Arrayinjava;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {5,8,9,8,6,3,7};
		int sum =0;
		/* for(int i=0;i<array.length;i++) 
		{
		sum += array[i];
		}
		System.out.println(sum);
	}*/
		// for each loop
		for(int element:array) {
			sum += element;
			}
		System.out.println(sum);
		}

}
