package String;
import java.util.Scanner;
public class Duplicate_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter String:");
		String str = s.nextLine();
		char [] string = str.toCharArray();
		int l = str.length(),count;

		for(int i=0;i<l ;i++)
		{
			count =1;
			for(int j=i+1;j<l;j++)
			{
				if(string[i]==string[j] && string[i]!=' ')
				{
					count++;
					string[j]='0';
				}
			}
			if(count >1 && string [i] !='0')
			
				System.out.println(string[i]);
		}
	}

}
