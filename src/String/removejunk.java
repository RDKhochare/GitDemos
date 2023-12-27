package String;

public class removejunk {
	
	public static void main(String[] args ) {
		
		String s ="##sds%%&&&&dsdcs(d)ddds)ff*f^f%^&f*df(ff))*^%$#$ java $%^&*(*&^%$%^&*^%$# Rohan123456789";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}