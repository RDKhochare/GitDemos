package practice;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = s.nextInt();
		boolean status = false;
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				status = true;
				break;
			}
		}
		if(status==true) {
			System.out.println(" not Prime");
		}
		else 
		{
			System.out.println("Prime");
		}
	}

}
