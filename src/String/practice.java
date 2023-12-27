package String;

public class practice {

	    public static void main(String[] args) {
	        practice p = new practice();
	       p.setup();
	       // p.New();
	    }

	    public void setup()
	    {
	    	String str = "Big black bug bit a big black dog on his big black nose";
	    	int count;
	    	str = str.toLowerCase();
	    	String [] words = str.split(" ");
	    	
	    	System.out.println("Duplicate Words are:");
	    	
	    	for(int i=0;i<words.length;i++)
	    	{
	    		count =1;
	    		for(int j=i+1;j<words.length;j++)
	    		{
	    			if(words[i].equals(words[j]))
	    			{
	    				count++;
	    				words[j]="0";
	    			}
	    		}
	    		if(count>1 && words[i]!="0")
	    		{
	    			System.out.println(words[i]);
	    		}
	    	}
	    }
	 }
	            


