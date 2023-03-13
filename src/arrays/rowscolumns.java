package arrays;

public class rowscolumns {
	public static void main(String[] args) {
		final int[][] matrix = {
				{1,1,1},
				{2,2,2},
				{3,4,5}
		};
		 for(int j=0; j<3; j++) {
			 for(int i=0; i<3; i++) {
				 System.out.print(matrix[i][j] + " ");
			 }
			 System.out.println();
		 }
	}

}
