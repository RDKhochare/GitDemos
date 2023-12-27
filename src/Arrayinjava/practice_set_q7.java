package Arrayinjava;

public class practice_set_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {781,628,339,457,598,1066,207,858,999};
		int min =Integer.MAX_VALUE;
		for(int e :a) {
			if(e<min) {
				min=e;
			}
		}
		System.out.println("min element is:"+min);
	}

	}


