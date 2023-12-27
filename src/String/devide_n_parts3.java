package String;
import java.util.Scanner;
public class devide_n_parts3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = s.nextLine();
		System.out.println("N value");
		int n =s.nextInt();
		
		int l = str.length();
		int Char = l/n;
		int temp =0;
		String [] string = new String[n];
		
		if (l%n==0)
		{
			for(int i=0;i<l;i=i+Char)
			{
				String part = str.substring(i, i+Char);
				string[temp]=part;
				temp++;
			}
			for(int i=0;i<string.length;i++)
			{
				System.out.println(string[i]);
			}
		}
		else
		{
			System.out.println("Not Splitable");
		}
		
		
		
	}

}
