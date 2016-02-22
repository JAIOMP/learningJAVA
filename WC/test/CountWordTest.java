import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CountWordTest {
	public String line = "Ram is a good boy.\n He 			 is a briliant in class.\n He is good in sport as well as in study";
	@Test
	public void should_read_a_file(){
		CountWord a = new CountWord(line);
		int num = a.countLine(); 
		assertEquals(num,2);
	}

	@Test
	public void gives_the_number_of_lines_in_a_file(){
		CountWord a = new CountWord(line);
		int num = a.wordCount();
		assertEquals(num,22);
	}

	@Test
	public void gives_the_number_of_characters_in_a_file() {
		CountWord a = new CountWord(line);
		int num = a.charCount();
		System.out.println(num);
		assertEquals(num,91);
	}
}