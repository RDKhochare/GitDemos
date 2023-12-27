package practice;
import java.util.Scanner;
public class squre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = s.nextInt();
		boolean isSqure= false;
		int a =0;
		for(int i=1;i<num;i++) 
		{
			a++;
		if(i* i==num)
		{
			isSqure=true;
			break;
		}
		
		}
		if(isSqure==true) 
		{
			System.out.println("Squre:");
		}
		else
		{
			System.out.println("Not Squre:");
		}
		System.out.println(a++);
		s.close();
	}

}
