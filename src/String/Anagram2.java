package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram2 {

	public void setup()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter str1");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		System.out.println("Enter str2");
		String s2=sc.nextLine();
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
		
			 if(Arrays.equals(str1, str2)==true) 
			{
				System.out.println(" Anagram");
				System.exit(0);
			}
		
		
		System.out.println(" Not Anagram");
	}
	
	public static void main(String[] args) {
	Anagram2 a = new Anagram2();
	a.setup();

	}

}
