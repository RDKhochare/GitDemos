package Arrayinjava;
import java.util.Arrays;

public class arrayequality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {1,2,3,4,55,6};
		int b []= {1,2,3,4,5,6};
		boolean equality= Arrays.equals(a, b);
	
		if(equality) {
			System.out.println("Array is equal");
		}
		else {
			System.out.println("Array is not equal");
		}
	}
}
