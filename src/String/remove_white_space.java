package String;

public class remove_white_space {

	public static void main(String[] args)
	{
		String str = "bba Dabba Jabba       selenium     automation";
		System.out.println("Before:-"+str);
		
		str = str.replaceAll("\\s","");
		System.out.println("After repacing:"+str);
	}
	
}
