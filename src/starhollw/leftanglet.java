package starhollw;

public class leftanglet {

	public static void main(String[] args) {
		int  n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i==n||k==i||k==1)
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
