class empDetails{
	public int empId;

	public String name;

	public empDetails(int empId,String empName){
		this.empId = empId;
		this.name = empName;
	}
	public static void main(String[] args) {
		empDetails member = new empDetails(1001,"JAI OM");
		System.out.println(member.empId);
	}
}
