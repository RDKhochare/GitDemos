package String;
import java.util.Scanner;

public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = s.nextLine();
		int l = str.length();
		int temp =0;
		
		String [] arr = new String[l*(l+1)/2];
		
		for(int i=0;i<l;i++)
		{
			for(int j=i;j<l;j++)	//1,2//
			{
				arr[temp]=str.substring(i, j+1);
				temp++;
			}
		}
		
		System.out.println("All Subsets are");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
