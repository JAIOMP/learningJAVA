import java.io.*;


class WordCount {
	public static void check_command(String command){
		if(command == "-l"){

		}
		if(command == "-m"){

		}
		if(command == "-c") {
			
		}
	}

	public static boolean isFileExist(File file){
		return file.isFile();
	}
	public static void main(String[] args) throws IOException {
		String fileName = args[0];
		File file = new File(fileName);
		int size = (int) file.length();
		if(isFileExist(file)){
			FileReader fr = new FileReader(file);
			char[] fileContents = new char[size];
			int buffer = fr.read(fileContents,0,size);
			CountWord wc = new CountWord(new String(fileContents));
			System.out.println("\t"+wc.countLine()+"\t"+wc.wordCount()+"\t"+wc.charCount()+"\t"+fileName);	
			fr.close();			
		}
	}
}