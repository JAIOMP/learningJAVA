// import static org.junit.Assert.assertEquals;
import org.junit.Test;
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
		int[][] expectedMatrix = {{3,5},{7,9}};
		
		Matrix firstMatrix = new Matrix(row,column);
		Matrix secondMatrix = new Matrix(row,column);
		firstMatrix.populate(firstArrayInput);
		secondMatrix.populate(secondArrayInput);
		Matrix destinationMatrix = firstMatrix.add(secondMatrix);
		
		assertArrayEquals(destinationMatrix.matrix,expectedMatrix);
	}

	@Test
	public void multiplyTwoMatrix() {
		int row = 2,column=2;
		int[] firstArrayInput = {1,2,3,4};
		int[] secondArrayInput = {2,3,4,5};
	} 

};

