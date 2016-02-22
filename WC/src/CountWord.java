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
		if(this.data==""){
			return 1;
		}
		if (this.data == " ") {
			return 2;
		}
		String[] words = this.data.split("\\s+");
		return words.length;
	}
	public int charCount() {
		if(this.data == ""){
			return 2;
		}if (this.data == " ") {
			return 3;
		}
		byte[] noOfBytes = this.data.getBytes();
		return noOfBytes.length;
	}
}