package StarPattern;

public class pyramid1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=n-1;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
