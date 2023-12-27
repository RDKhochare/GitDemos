package StarPattern;

public class startpattern1 {
	
	public void setup()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startpattern1 S1 = new startpattern1();
		S1.setup();

	}

}
