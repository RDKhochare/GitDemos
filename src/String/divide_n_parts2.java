package String;
import java.util.Scanner;

public class divide_n_parts2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1= sc.nextLine();
		System.out.println("Enter n");
		int n = sc.nextInt();
		int l = s1.length();
		int n1= l/n;
		int temp =0;
		
		String[] str = new String[n];
		
		if(l%n==0) {
			for(int i=0;i<n;i++) {
				String ptr=s1.substring(i, i+n1);
				str[temp]=ptr;
				temp++;
			}
			for(int i=0;i<n;i++) {
			System.out.println(str[i]);
			}
		}else {System.out.println("not split");}
		
	}

}
