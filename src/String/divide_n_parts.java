package String;
import java.util.Scanner;

public class divide_n_parts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1= sc.nextLine();
		System.out.println("Enter n");
		int n = sc.nextInt();
		int l = s1.length();
		int n1 =l/n;
		String s;
		if(l%n==0) {
			for(int i=0;i<n;i++) 
			{
				s ="";
				for (int j=n1*i;j<(i+1)*n1;j++)
				{
				s= s+s1.charAt(j);	
				}System.out.println(s);
			}
		}else {
			System.out.println("Cank't Split");
		}
		
	}

}
