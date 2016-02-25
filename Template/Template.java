class Template <K extends String,V extends Integer> {
	private String type;
	private int wheels;
	public Template(String type,int wheels){
		this.type = type;
		this.wheels = wheels;
	}
	public void movesOn(){
		System.out.println("it moves on "+this.type+" it have "+ this.wheels+ "wheels");
	}
	public static void main(String[] args) {
		Template<String,Integer> aeroplane = new Template<String,Integer>("Air",2);
		aeroplane.movesOn();
	}
	
}