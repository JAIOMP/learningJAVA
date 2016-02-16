class empDetails{
	private int empId;

	private String name;

	public empDetails(int empId,String empName){
		this.empId = empId;
		this.name = empName;
	}
	static int factorial(int num){
		int result = 1;
		for (int i=1;i <= num;i++) {
			result *= i;
		}
		return result;
	}
	static int fibo(int number){
		int prev=0,next=1,answer=0;
		if (number==0)return 0;
		if (number==1)return 1; 
		for (int i = number-1;i > 0;i--) {
			answer = prev + next;
			prev = next;
			next = answer; 
		}
		return answer;
	}
	public static void main(String[] args) {
		empDetails member = new empDetails(1001,"JAI OM");
		System.out.println("person has id" +member.empId+ "and name" +member.name);
		System.out.println(factorial(6));
		System.out.println(fibo(2));
	}
}
