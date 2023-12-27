package Arrayinjava;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8};
		//int b [] =  {1,2,3,8,5,6};
		
		boolean status = false;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					status =true;
				}
			}
			System.out.println("hiii");
		}
		if (status) {
			System.out.println("Dupliacte");
		}
		else {
			System.out.println("Not Duplicate");
		}

		
	}
	}	
