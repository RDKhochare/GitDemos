package numberpattern;

public class num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		for(int i=1;i<=n;i++)
		{
			int no=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no =no + 5-j;
			}
			System.out.println();
		}
	}

}
