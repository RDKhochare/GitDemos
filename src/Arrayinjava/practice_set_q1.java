package Arrayinjava;
import java.util.Scanner;


public class practice_set_q1 {

	public static void main(String[] args)   
	{    
	int n;
	System.out.println("String length");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int array[]= new int[5];
	System.out.println("Enter No of elements:");
	for(int i=0;i<n;i++) {
		array[i]=sc.nextInt();
	}
	
	int sum =0;
	
	for (int i =0;i<n;i++) {
		sum+=array[i];
	}
	System.out.println("Sum of element is:"+sum);
	sc.close();
	}

}
