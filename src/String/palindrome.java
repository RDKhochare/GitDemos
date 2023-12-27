package String;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = s.nextLine();
		int l = str.length();
		boolean flag = true;
		for(int i=0;i<=l/2;i++)
		{
			if(str.charAt(i) != str.charAt(l-i-1))
			{
				flag = false;
				break;
			}		
		}
		if(flag)
			System.out.println("Given String Palindrome");
		else
			System.out.println("Givem String is not Palindrome");

	}

}
