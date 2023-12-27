package StarPattern;

public class diagonalstar3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
					System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
					if(i<=4 && k==1) 
					{
						System.out.print("*");
					}	else
					{
						System.out.print(" ");
					}
			}
			for(int l=2;l<=i;l++)
			{
				if(i==l)
				{
					System.out.print("*");
				}	else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
}
}
