import java.util.Arrays;

class Array {
	int[] marks = {12,2,34,56,6,88,92,4,5};
	public Array(){

	}
	public void print(){
		for (int i = 0;i < marks.length; i++ ) {
			System.out.println(marks[i]);
		}	
	}
	public static void main(String[] args) {
		Array student = new Array();
		student.print();
	}
};