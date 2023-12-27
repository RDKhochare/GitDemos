package starhollw;

public class triangle {
	
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i==n||k==1)
				{
				System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int l=2;l<=i;l++)
			{
				if(i==n || l==i)
				{
				System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
				}
			System.out.println();
		}
	}

}
