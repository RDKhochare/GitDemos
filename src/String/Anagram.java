package String;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public void setup()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter str1");
		String s1=sc.nextLine();
		
		System.out.println("Enter str2");
		String s2=sc.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		
		
		if(str1.length!=str2.length)
		{
			System.out.println("Not Anagram");
			System.exit(0);
		}
		
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i =0;i<str1.length;i++)
		{
			if(str1[i]!=str2[i])
			{
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}
		
		System.out.println("Anagram");
	}
	
	public static void main(String[] args) {
	Anagram a = new Anagram();
	a.setup();

	}

}
