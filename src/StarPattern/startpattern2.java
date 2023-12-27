package StarPattern;

public class startpattern2 
{
	public void setup()
	{
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	startpattern2 S2 = new startpattern2();
	S2.setup();

}

}
