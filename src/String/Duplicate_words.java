package String;
import java.util.Scanner;

public class Duplicate_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String:");
	String str = s.nextLine();
	String words[] = str.split(" ");
	str = str.toLowerCase();    
	int count;
	
	System.out.println("Duplicate words are:");
	for(int i=0 ; i<words.length ; i++)
	{
		count =1;
		for(int j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j]))
			{
				count++;
				words[j]="0";
			}
		}

		if (count > 1 && count !='0')
		System.out.println(words[i]);
		}
	}

}
