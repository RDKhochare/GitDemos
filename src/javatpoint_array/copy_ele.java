package javatpoint_array;

public class copy_ele {
	
	public void setup() {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = new int[arr1.length];
		
		for (int i=0;i<=arr1.length;i++)
		{
			arr2=arr1;
		}
		
		System.out.println("original array is:");
		for(int i=0;i<arr1.length;i++) 
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("Duplicate arry is:");
		for(int i=0 ;i<arr1.length;i++)
		{
			System.out.print(arr2[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
copy_ele a = new copy_ele();
a.setup();
}

}
