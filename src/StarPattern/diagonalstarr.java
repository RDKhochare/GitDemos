package StarPattern;

public class diagonalstarr {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int k=2;k<=i;k++)
			{
				if(i==k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=2;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
