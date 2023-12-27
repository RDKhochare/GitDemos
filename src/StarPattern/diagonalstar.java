package StarPattern;

public class diagonalstar {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++) 
			{
				if(i<=5 && j==i+2 ||
						i<=5 && j==i-2 || 
						i==j && i+j==8 || i+j==4)
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
