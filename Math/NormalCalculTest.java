import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NormalCalculTest {
	@Test
	public void doAdd() {
		NormalCalcul calculator = new NormalCalcul(2,3);
		int result = calculator.add();
		assertEquals(5, result);		
	}

	@Test
	public void doMultiply(){
		NormalCalcul calculator = new NormalCalcul(4,5);
		int result = calculator.multiply();
		assertEquals(20, result);
	}

};

