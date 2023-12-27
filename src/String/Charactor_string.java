package String;

import java.util.Scanner;

public class Charactor_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charactor:");
		String str = sc.nextLine();
		
		//String str = "A";
		int count = 0;
	//	char string[] =str.toCharArray();
		
		for(int i =0;i<str.length();i++)
			if(str.charAt(i) != ' ') 
		{
			count = count+1;
		}
		
		System.out.println(count);
	}

}
