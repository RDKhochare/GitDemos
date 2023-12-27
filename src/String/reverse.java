package String;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter String:");
		String str = s.nextLine();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("Given String is palindrom");
		}
		else
		{
			System.out.println("Given String is not palindrom");
		}
		
	}

}
