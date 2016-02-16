class Patterns {
	static String makeLine(String symbol,int side){
		String line = symbol;
		for (int i = 0;i <= side-2;i++ ) {
			line = line.concat(symbol);
		}
		return line;
	}
	static void printSquare(String symbol,int side){
		String createLine = makeLine(symbol,side);
		for (int i = 0;i < side ;i++) {
			System.out.println(createLine);
		}
	}
	static void LeftAlignedTriangle(String symbol,int side){
		String line = " ";
		for (int i = 0;i < side;i++) {
			line = line.concat(symbol);
			System.out.println(line);
		}
	}
	static void hollowRectangle(String symbol,int height,int width){
		String line = " ";
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++)
				if (i == 0 || j == 0 || i == height - 1 || j == width - 1)
					System.out.print(symbol + line);
				else
					System.out.print(line + line);
					System.out.println();
				}		
	}
	static void splitString(String sentence){
		String[] splitArray = sentence.split("");
		System.out.println(splitArray[2]);
	}
	static String replaceCharWithAnotherChar(int position,char symbol,String str){
		char[] charGroup = str.toCharArray();
		charGroup[position] = symbol;
		return new String(charGroup); 
	}
	static String replaceCharForDiamond(int position,char symbol,String str,int count){
		char[] charGroup = str.toCharArray();
		if (count>0) {
			charGroup[position-count] = symbol;
			charGroup[position+count] = symbol;
		}else{
			charGroup[position] = symbol;
		}
		return new String(charGroup); 
	}
	static void RightAlignedTriangle(char symbol,int height){
		String line = " ";
		String newLine = makeLine(line,height);
		for (int i = 1;i < height;i++) {
			String eachLine = replaceCharWithAnotherChar(newLine.length()-i,symbol,newLine);
			System.out.println(eachLine);
			newLine = eachLine;
		}
	}
	static void alternatePatterns(int numberOfLines,int length){
		String dashLine = makeLine("-",length);
		String starLine = makeLine("*",length);
		for (int i = 0;i < numberOfLines ;i++) {
			if(dashLine.indexOf("*")==-1)
			System.out.println(dashLine);
			System.out.println(starLine);
		}
	}
	static void diamond(int length){
		int position = length/2;
		int count = 0;
		int secCount = 0;
		String line = makeLine(" ",length);
		while(secCount>=0){
			if(count<=position){
				System.out.println(replaceCharForDiamond(position,'*',line,count));		
				line = replaceCharForDiamond(position,'*',line,count);
				count++;
				secCount = count-1;
			} else {
				System.out.println(replaceCharForDiamond(position,' ',line,secCount));		
				line = replaceCharForDiamond(position,' ',line,secCount);
				secCount--;
			}
		}
	}
	public static void main(String[] args) {
		// printSquare("*",6);
		// LeftAlignedTriangle("*",6);
		// hollowRectangle("*",5,6);
		// RightAlignedTriangle('*',7);
		// alternatePatterns(6,7);
		// System.out.println(5/2);
		diamond(7);
	}
}