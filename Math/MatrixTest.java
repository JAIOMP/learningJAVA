import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;



public class MatrixTest {
	@Test
	public void populate() {
		int row = 2,column=2;
		int[] input = {1,2,3,4};
		int[][] expected = {{1,2},{3,4}};
		Matrix actualMatrix = new Matrix(row,column);
		actualMatrix.populate(input);
		assertArrayEquals(actualMatrix.matrix,expected);
	}

	@Test
	public void addTwoMatrix() {
		int row = 2,column=2;
		int[] firstArrayInput = {1,2,3,4};
		int[] secondArrayInput = {2,3,4,5};
		int[] expectedOutput = {3,5,7,9};
		
		Matrix firstMatrix = new Matrix(row,column);
		Matrix secondMatrix = new Matrix(row,column);
		Matrix expectedMatrix = new Matrix(row,column);

		firstMatrix.populate(firstArrayInput);
		secondMatrix.populate(secondArrayInput);
		expectedMatrix.populate(expectedOutput);
		Matrix destinationMatrix = firstMatrix.add(secondMatrix);
		
		assertArrayEquals(destinationMatrix.matrix,expectedMatrix.matrix);
	}

	@Test
	public void multiplyTwoMatrix() {
		int row = 2,column=2;
		int[] firstArrayInput = {1,2,3,4};
		int[] secondArrayInput = {2,3,4,5};
		int[] expectedOutput = {11,16,19,28};
		Matrix firstMatrix  = new Matrix(row,column);
		Matrix secondMatrix = new Matrix(row,column);
		Matrix expectedMatrix = new Matrix(row,column);

		firstMatrix.populate(firstArrayInput);
		secondMatrix.populate(secondArrayInput);
		expectedMatrix.populate(expectedOutput);
		Matrix destinationMatrix = firstMatrix.multiply(secondMatrix);

		assertArrayEquals(destinationMatrix.matrix,expectedMatrix.matrix);

	}

	@Test 
	public void determinantOfMatrix(){
    	int[] numbers = {3,4,5,6,7,8,1,9,6};
    	Matrix matrix = new Matrix(3,3);
    	matrix.populate(numbers);
    	int[][] input = matrix.matrix;
    	int result = matrix.determinant(input,3);
    	System.out.println(result);
    	assertEquals(result,33);
	}
};

