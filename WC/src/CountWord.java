public class CountWord {
	String data;
	public CountWord(String fileData){
		this.data = fileData;

	}
	public int countLine(){
		String[] lines = this.data.split("\n");
		return lines.length-1;
	}
	public int wordCount(){
		String[] words = this.data.split("\\s+");
		return words.length;
	}
	public int charCount() {
		byte[] noOfBytes = this.data.getBytes();
		return noOfBytes.length;
	}
}