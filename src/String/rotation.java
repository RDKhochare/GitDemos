package String;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="abcde";
		String s2 ="deabc";
		 		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Rational");	
		}
		else
		{
			s1=s1.concat(s1);

			if(s1.indexOf(s2) != -1)
			System.out.println("Rational");
		else
		
			System.out.println("Not rotational");
	}

	}
}
