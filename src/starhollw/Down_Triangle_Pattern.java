package starhollw;

public class Down_Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n;k>=i;k--)
			{
				if(k==n || i==1)
				{
				System.out.print(" *");
				}
				else
				{
					System.out.print("  ");	
				}
			}
			for(int l=n-1;l>=i;l--)
			{
				if(i==1 || l==i)
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
