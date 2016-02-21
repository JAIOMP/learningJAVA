import java.io.*;

class CountWord {
	public static void main(String[] args) throws IOException {
	String fileName = args[0];
	File file = new File(fileName);
	int size = (int) file.length();
	FileReader fr = new FileReader(file);
	char[] fileContents = new char[500];
	int buffer = fr.read(fileContents,0,size);
	System.out.println(fileContents);
	fr.close();
	}
}