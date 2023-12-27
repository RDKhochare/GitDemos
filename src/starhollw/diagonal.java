package starhollw;

public class diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		for (int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=2;l<=i;l++)
			{
				if(i==l)
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
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-1;k>=i;k--)
			{
				if(k==n-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=n-2;l>=i;l--)
			{
				if(l==i)
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
