package String;
import java.util.Scanner;
public class max_min_char {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter New String:");
		String str = s.nextLine();
		int l= str.length();
		int i,j;
		char[] chararray = new char[l];
		chararray = str.toCharArray();
		int [] freq = new int[l];
		int min,max;
		char minchar=str.charAt(0),maxchar=str.charAt(0);
		
		for( i=0 ;i<l;i++)
		{
			freq[i]=1;
			for(j=i+1;j<l;j++)
			{
				if(chararray[i] == chararray[j] && chararray[i] !=' ' && chararray[i]!='0')
				{
					freq[i]++;
					chararray[j]= '0';
				}
			}
		}
		for(i=0 ;i<l;i++)
		{
		
				min=max=freq[0];
				if(min>freq[i] && freq[i] !=0)
				{
					min = freq[i];
					minchar = chararray[i];
				}
				if(max< freq[i])
				{
					max = freq[i];
					maxchar = chararray[i];
				}
			
		}
		System.out.println("Min char:"+minchar);
		System.out.println("Max char:"+maxchar);
		
	}

}
