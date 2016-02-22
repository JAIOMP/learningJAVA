import java.io.*;

class WordCount{
	public static void main(String[] args) throws IOException {
		String fileName = args[0];
		File file = new File(fileName);
		int size = (int) file.length();
		FileReader fr = new FileReader(file);
		char[] fileContents = new char[size];
		int buffer = fr.read(fileContents,0,size);
		CountWord wc = new CountWord(new String(fileContents));
		System.out.println("\t"+wc.countLine()+"\t"+wc.wordCount()+"\t"+wc.charCount()+"\t"+fileName);	
		fr.close();
	}
}