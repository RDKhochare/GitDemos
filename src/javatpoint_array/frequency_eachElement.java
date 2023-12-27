package javatpoint_array;

public class frequency_eachElement {
	
	public void setup()
	{
		int arr[] = {1,2,3,4,2,3,8,5,3,7,8,4,5};
		int freq[] = new int[arr.length];
		int visited =0;
		
		for(int i=0;i<arr.length;i++)
		{
			int count =1;
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
				if (freq[i]!= visited)
				{
					freq[i]=count;
				}
			}
				
		}
		 System.out.println("---------------------------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------");
	        
	        for(int i=0;i<arr.length;i++) 
	        {
	        	if(freq[i]!=visited) 
	        	{
	        		System.out.println(arr[i]+ " | " +freq[i]);
	        	}
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequency_eachElement F = new frequency_eachElement();
		F.setup();

	}

}
