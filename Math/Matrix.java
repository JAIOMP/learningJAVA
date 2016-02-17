import java.util.Scanner;
class Matrix {
	int matrix[][];
	int row,column; 

	public Matrix(){

	}

	public void create(){
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter row num");
		
		row = Integer.parseInt(scan.nextLine());

		System.out.println("Enter column num");

		column = Integer.parseInt(scan.nextLine());	

		System.out.println("enter digit:");

		matrix = new int[row][column];

		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<column;j++) {

				matrix[i][j] = scan.nextInt();

			}
		}
	} 

	public void display() {
		System.out.println("\n The Matrix is :");
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<column;j++) {
				System.out.println("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matrix createMatrix = new Matrix();
		createMatrix.create();
		createMatrix.display();
	}	
}