package String;
import java.util.*;

public class Punctional_Charactor {

	public void Input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charactor:");
		String str = sc.nextLine();
	
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='!' ||str.charAt(i)==','||str.charAt(i)=='.')
			count = count +1;
			
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punctional_Charactor c= new Punctional_Charactor();
		c.Input();
	}

}
