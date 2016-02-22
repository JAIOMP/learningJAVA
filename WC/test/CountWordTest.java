import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CountWordTest {
	public String lines = "Ram is a good boy.\n He is a briliant in class.\n He is good in sport as well as in study";
	public String line_with_tabs = "This small example 			shows\nyou how to write a  unit test. your 			 need to have 	\na 	JDK installed and a text editor. (in 			general it \nis recommended 		 to 	 use	a  build tool for building \nyour software and 		running		 the tests.)";
	
	@Test
	public void should__a_file(){
		CountWord a = new CountWord(lines);
		int num = a.countLine(); 
		assertEquals(num,2);
	}

	@Test
	public void gives_the_number_of_lines_in_a_file(){
		CountWord a = new CountWord(lines);
		int num = a.wordCount();
		assertEquals(num,21);
	}

	@Test
	public void gives_the_number_of_characters_in_a_file() {
		CountWord a = new CountWord(lines);
		int num = a.charCount();
		assertEquals(num,87);
	}

	@Test
	public void should_give_the_number_of_Bytes_in_a_line_with_tabs(){
		CountWord a = new CountWord(line_with_tabs);
		int num = a.charCount();
		int numOflines = a.countLine();
		int numOfWords = a.wordCount();
		assertEquals(num,234);
		assertEquals(numOflines,4);
		assertEquals(numOfWords,40);

	}

	@Test
	public void charCount_lineCount_wordCount_should_gives_0_for_blank_string(){
		CountWord a = new CountWord(" ");
		int num1 = a.charCount();
		int num2 = a.wordCount();
		int num3 = a.countLine();
		assertEquals(num1,3);
		assertEquals(num2,2); 
		assertEquals(num3,0);  
	}
}