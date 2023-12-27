package Arrayinjava;

public class practice_set_q4_AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3},{4,5,6}};
		int [][] b = {{7,8,9},{10,11,12}};
		int [][] result = {{0,0,0},{0,0,0}};
		for(int i =0;i<a.length;i++) {
			for (int j =0;j<a[i].length;j++) {
				result[i][j] = a[i][j]+b[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
