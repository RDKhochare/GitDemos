package String;
import java.util.*;
public class Vowel_consoles {

	public void in()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String:");
		String str = s.nextLine();
		
		str = str.toLowerCase();
	
		int Vcount=0;
		int Ccount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				Vcount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				Ccount++;
			}
			
		}
		System.out.println("Vowels: "+Vcount+" Consoles: "+Ccount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vowel_consoles v =new Vowel_consoles();
		v.in();
	}

}
