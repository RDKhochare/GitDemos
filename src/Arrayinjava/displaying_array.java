package Arrayinjava;

public class displaying_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks = {96,78,56,85,77,89};
		int [] rates = {97,58,78,95,84,53};
		
		// by using for loop
		
		for(int i=0; i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		// Question:- print element in reverse order
		System.out.println("In reverse order");
		for(int i=marks.length-1; i>=0;i--) {
		
			System.out.println(marks[i]);
		}
		
		// by using for  each loop
		System.out.println("Using for each loop");
		for(int element:marks) {
			System.out.println(element);
		}
		System.out.println("rates");
		for(int element:rates) {
			System.out.println(element);
		}

	}

}
